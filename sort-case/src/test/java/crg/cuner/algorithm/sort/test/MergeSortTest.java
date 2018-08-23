package crg.cuner.algorithm.sort.test;

import org.cuner.algorithm.sort.MergeSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by houan on 18/8/23.
 */
public class MergeSortTest {

    @Test
    public void mergeSort() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        MergeSort.merge_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
