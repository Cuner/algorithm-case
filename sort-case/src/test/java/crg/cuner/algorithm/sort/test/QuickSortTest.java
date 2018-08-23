package crg.cuner.algorithm.sort.test;

import org.cuner.algorithm.sort.QuickSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by houan on 18/8/23.
 */
public class QuickSortTest {

    @Test
    public void quickSortSwap() {
        int [] arr = {100, 23, 40, 20, 333, 123, 0, 9};
        QuickSort.quick_sort_swap(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void quickSortDig() {
        int [] arr = {100, 23, 40, 20, 333, 123, 0, 9};
        QuickSort.quick_sort_dig(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
