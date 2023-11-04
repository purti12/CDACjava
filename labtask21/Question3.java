/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask21;
;
public class Question3 {

    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();

     
        Thread myThread = new Thread(myRunnable);

       
        myThread.run();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // Your code in the run method
            System.out.println("This is the run method .");
            System.out.println("method is called....");
        }
    }
}

