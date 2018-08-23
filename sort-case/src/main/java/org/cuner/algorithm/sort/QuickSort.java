package org.cuner.algorithm.sort;

/**
 * Created by houan on 18/8/23.
 */
public class QuickSort {

    /**
     * 快速排序-交换法
     * 主要思路：以数组左边开始第一个元素作为基准值，将比该值小的值移至该值左边，将比该值大的值移至该值右边
     * 交换：从右边开始找到第一个比基准值小的值A，然后从左边开始找到第一个比基准值大的值B，然后将指A、B互换位置
     * 交换完成后继续交换操作，直到左边的值都比基准值小，右边的值都比基准值大
     * 最后：将基准值移至左右两边的中间
     * @param arr
     * @param left
     * @param right
     */
    public static void quick_sort_swap(int[] arr, int left, int right) {
        //数组校验
        if (arr == null || arr.length == 0 || arr.length < right + 1) {
            return;
        }
        //递归调用终止条件
        if (left >= right) {
            return;
        }

        int i = left;
        int j = right;
        int median = arr[left];

        while (i < j) {
            while (arr[j] >= median && i < j) {
                j--;
            }
            while (arr[i] <= median && i < j) {
                i++;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;

        quick_sort_swap(arr, left, i-1);
        quick_sort_swap(arr, i+1, right);
    }

    /**
     * 快速排序-挖坑法
     * 主要思路：以数组左边开始第一个元素作为基准值，将比该值小的值移至该值左边，将比该值大的值移至该值右边
     * 挖坑：从右边开始找到一个比基准值小的值A，然后以挖坑的形式将该值填充到左边的坑位，
     * 此时右边便多了一个待填充的坑位，然后从左边开始找到一个比基准值大的值B，然后以挖坑的形式将该值填充到右边的坑位，以此循环
     * 最后：将基准值填充到最后一个坑位
     * @param arr
     * @param left
     * @param right
     */
    public static void quick_sort_dig(int[] arr, int left, int right) {
        //数组校验
        if (arr == null || arr.length == 0 || arr.length < right + 1) {
            return;
        }
        //递归调用终止条件
        if (left >= right) {
            return;
        }

        int i = left;
        int j = right;
        int median = arr[left];

        while (i < j) {
            while (arr[j] >= median && i < j) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }

            while (arr[i] <= median && i < j) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = median;

        quick_sort_dig(arr, left, i-1);
        quick_sort_dig(arr, i+1, right);
    }
}
