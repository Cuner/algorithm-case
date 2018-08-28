package org.cuner.algorithm.sort;

/**
 * Created by houan on 18/8/28.
 */
public class InsertionSort {

    public static void insertion_sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            insert_into_arr(arr, i);
        }
    }

    private static void insert_into_arr(int[] arr, int index) {
        if (index < 1 || index > arr.length - 1) {
            return;
        }

        for (int i = index; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            } else {
                break;
            }
        }
    }
}
