package solutions._66_plus_one;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommonSolutionTest {
	
	@Test
	public void plusOne() {
		
		CommonSolution solution = new CommonSolution();
		Assert.assertArrayEquals(new int[]{1,2,3,5}, solution.plusOne(new int[]{1,2,3,4}));
		Assert.assertArrayEquals(new int[]{1,0,0,0,0,0}, solution.plusOne(new int[]{9,9,9,9,9}));
		
	}
}
