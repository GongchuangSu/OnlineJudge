package solutions._70_climbing_stairs;

import org.junit.Assert;
import org.junit.Test;

public class DPSolutionTest {
	
	@Test
	public void climbStairs () {
		DPSolution solution = new DPSolution();
		Assert.assertEquals(2,solution.climbStairs(2) );
	}
}
