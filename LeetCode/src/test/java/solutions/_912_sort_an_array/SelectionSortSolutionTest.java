package solutions._912_sort_an_array;

import org.junit.Test;

import java.util.Arrays;

public class SelectionSortSolutionTest {
	
	@Test
	public void sortArray () {
		SelectionSortSolution solution = new SelectionSortSolution();
		System.out.println(Arrays.toString(solution.sortArray(new int[]{5,2,3,1})));
		System.out.println(Arrays.toString(solution.sortArray(new int[]{5,1,1,2,0,0})));
	}
}
