package solutions._70_climbing_stairs;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
	
	@Test
	public void climbStairs () {
		DPSolution solution = new DPSolution();
		Assert.assertEquals(3,solution.climbStairs(3) );
		FibSolution fibSolution = new FibSolution();
		Assert.assertEquals(3,fibSolution.climbStairs(3));
	}
}
