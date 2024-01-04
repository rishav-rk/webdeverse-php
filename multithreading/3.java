// Write a Java Program that sorts an array of integers using multiple threads. */

import java.util.Arrays;

class ParallelMergeSort {

    private final int[] array;

    private ParallelMergeSort(int[] array) {
        this.array = array;
    }

    private void merge(int low, int mid, int high) {
        int leftLength = mid - low + 1;
        int rightLength = high - mid;

        int[] left = new int[leftLength];
        int[] right = new int[rightLength];

        for (int i = 0; i < leftLength; i++) {
            left[i] = array[low + i];
        }

        for (int j = 0; j < rightLength; j++) {
            right[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;

        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < leftLength) {
            array[k++] = left[i++];
        }

        while (j < rightLength) {
            array[k++] = right[j++];
        }
    }

    private void mergeSort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            Thread leftThread = new MergeSortThread(low, mid);
            Thread rightThread = new MergeSortThread(mid + 1, high);

            leftThread.start();
            rightThread.start();

            try {
                leftThread.join();
                rightThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            merge(low, mid, high);
        }
    }

    private class MergeSortThread extends Thread {
        private int low, high;

        MergeSortThread(int low, int high) {
            this.low = low;
            this.high = high;
        }

        @Override
        public void run() {
            mergeSort(low, high);
        }
    }

    private static void parallelMergeSort(int[] array) {
        ParallelMergeSort sorter = new ParallelMergeSort(array);
        sorter.mergeSort(0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 3, 9, 5, 2, 1, 6, 11, 8, 10};

        System.out.println("Array before sorting: " + Arrays.toString(arr));

        parallelMergeSort(arr);

        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
