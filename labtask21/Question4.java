/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask21;

;
import java.util.concurrent.atomic.AtomicLong;

public class Question4 {
    public static void main(String[] args) {
        int limit = 100; 
        int numThreads = 4; 

        AtomicLong sum = new AtomicLong(0);
        Thread[] threads = new Thread[numThreads];
        PrimeSumCalculator[] calculators = new PrimeSumCalculator[numThreads];

        int segment = (limit + 1) / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int start = i * segment;
            int end = (i == numThreads - 1) ? limit : (i + 1) * segment - 1;
            calculators[i] = new PrimeSumCalculator(start, end, sum);
            threads[i] = new Thread(calculators[i]);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of prime numbers up to " + limit + " is: " + sum);
    }

    static class PrimeSumCalculator implements Runnable {
        private final int start;
        private final int end;
        private final AtomicLong sum;

        public PrimeSumCalculator(int start, int end, AtomicLong sum) {
            this.start = start;
            this.end = end;
            this.sum = sum;
        }

        @Override
        public void run() {
            long localSum = 0;
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    localSum += i;
                }
            }
            sum.addAndGet(localSum);
        }

        // Function to check if a number is prime
        private boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

