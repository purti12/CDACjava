/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask21;



import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array: " + Arrays.toString(arr));

        parallelMergeSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void parallelMergeSort(int[] arr) {
        int cores = Runtime.getRuntime().availableProcessors();
        parallelMergeSort(arr, cores);
    }

    private static void parallelMergeSort(int[] arr, int threads) {
        if (threads <= 1 || arr.length <= 1) {
            Arrays.sort(arr);
        } else {
            int middle = arr.length / 2;

            int[] left = Arrays.copyOfRange(arr, 0, middle);
            int[] right = Arrays.copyOfRange(arr, middle, arr.length);

            Thread leftSorter = new Thread(() -> parallelMergeSort(left, threads / 2));
            Thread rightSorter = new Thread(() -> parallelMergeSort(right, threads / 2));

            leftSorter.start();
            rightSorter.start();

            try {
                leftSorter.join();
                rightSorter.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            merge(left, right, arr);
        }
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < leftLength) {
            arr[k++] = left[i++];
        }

        while (j < rightLength) {
            arr[k++] = right[j++];
        }
    }
}


