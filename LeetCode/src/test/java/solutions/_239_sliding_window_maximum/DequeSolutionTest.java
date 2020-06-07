package solutions._239_sliding_window_maximum;

import org.junit.Test;

import java.util.Arrays;

public class DequeSolutionTest {
	
	@Test
	public void maxSlidingWindow () {
		DequeSolution dequeSolution = new DequeSolution();
		int[] result = dequeSolution.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
		System.out.println(Arrays.toString(result));
	}
}
