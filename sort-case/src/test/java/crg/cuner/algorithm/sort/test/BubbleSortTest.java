package crg.cuner.algorithm.sort.test;

import org.cuner.algorithm.sort.BubbleSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by houan on 18/8/28.
 */
public class BubbleSortTest {

    @Test
    public void bubbleSort() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        BubbleSort.bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
