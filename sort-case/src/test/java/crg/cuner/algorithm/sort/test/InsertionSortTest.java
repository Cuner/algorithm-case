package crg.cuner.algorithm.sort.test;

import org.cuner.algorithm.sort.InsertionSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by houan on 18/8/28.
 */
public class InsertionSortTest {

    @Test
    public void insertionSort() {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        InsertionSort.insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
