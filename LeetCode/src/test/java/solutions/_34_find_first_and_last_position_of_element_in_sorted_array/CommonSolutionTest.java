package solutions._34_find_first_and_last_position_of_element_in_sorted_array;

import org.junit.Test;
import java.util.Arrays;

public class CommonSolutionTest {
	
	@Test
	public void searchRange () {
		CommonSolution solution = new CommonSolution();
		System.out.println(Arrays.toString(solution.searchRange(new int[]{5,7,7,8,8,10}, 8)));
		System.out.println(Arrays.toString(solution.searchRange(new int[]{2,2}, 2)));
		System.out.println(Arrays.toString(solution.searchRange(new int[]{5,7,7,8,8,10}, 6)));
	}
}
