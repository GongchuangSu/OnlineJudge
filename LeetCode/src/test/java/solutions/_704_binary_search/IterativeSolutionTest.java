package solutions._704_binary_search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterativeSolutionTest {
	
	@Test
	public void search () {
		IterativeSolution solution = new IterativeSolution();
		Assert.assertEquals(4, solution.search(new int[]{-1,0,3,5,9,12}, 9));
		Assert.assertEquals(-1, solution.search(new int[]{-1,0,3,5,9,12}, 2));
	}
}
