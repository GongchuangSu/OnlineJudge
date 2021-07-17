package solutions._4_median_of_two_sorted_arrays;

import org.junit.Test;

public class CommonSolutionTest {
	
	@Test
	public void test(){
		CommonSolution solution = new CommonSolution();
		System.out.println(solution.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
		System.out.println(solution.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
		System.out.println(solution.findMedianSortedArrays(new int[]{0,0}, new int[]{0,0}));
		System.out.println(solution.findMedianSortedArrays(new int[]{}, new int[]{1}));
		System.out.println(solution.findMedianSortedArrays(new int[]{2}, new int[]{}));
	}
	
}
