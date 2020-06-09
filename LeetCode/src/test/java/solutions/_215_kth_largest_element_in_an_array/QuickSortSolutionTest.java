package solutions._215_kth_largest_element_in_an_array;

import org.junit.Test;

public class QuickSortSolutionTest {
	
	@Test
	public void findKthLargest () {
		QuickSortSolution solution = new QuickSortSolution();
		System.out.println(solution.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
		System.out.println(solution.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
	}
}
