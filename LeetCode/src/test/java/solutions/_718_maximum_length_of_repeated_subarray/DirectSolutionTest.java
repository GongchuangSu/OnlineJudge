package solutions._718_maximum_length_of_repeated_subarray;

import org.junit.Test;

import static org.junit.Assert.*;

public class DirectSolutionTest {
	
	@Test
	public void findLength () {
		DirectSolution solution = new DirectSolution();
		System.out.println(solution.findLength(new int[]{1,2,3,2,1}, new int[]{3,2,1,4,7}));
	}
}
