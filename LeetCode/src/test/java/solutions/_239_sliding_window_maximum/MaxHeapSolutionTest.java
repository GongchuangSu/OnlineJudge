package solutions._239_sliding_window_maximum;

import org.junit.Test;

import java.util.Arrays;

public class MaxHeapSolutionTest {
	
	@Test
	public void maxSlidingWindow () {
		MaxHeapSolution maxHeapSolution = new MaxHeapSolution();
		int[] result = maxHeapSolution.maxSlidingWindow(new int[]{1,3,-1,5,5,3,6,7}, 3);
		System.out.println(Arrays.toString(result));
	}
}
