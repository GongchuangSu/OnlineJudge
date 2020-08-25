package solutions._718_maximum_length_of_repeated_subarray;

import org.junit.Assert;
import org.junit.Test;

public class DPSolutionTest {
	
	@Test
	public void test(){
		DPSolution solution = new DPSolution();
		Assert.assertEquals(3, solution.findLength(new int[]{1,2,3,2,1}, new int[]{3,2,1,4,7}));
	}
	
}
