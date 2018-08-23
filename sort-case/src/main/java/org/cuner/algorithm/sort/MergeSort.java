package org.cuner.algorithm.sort;

import java.util.Arrays;

/**
 * Created by houan on 18/8/23.
 */
public class MergeSort {

    /**
     * 归并排序
     * @param arr
     */
    public static void merge_sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int middle = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        merge_sort(left);
        merge_sort(right);

        int i = 0;
        int j = 0;
        for (int k = 0 ; k < arr.length ; k++) {
            if (j > right.length - 1 || left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }

        }
    }

}
