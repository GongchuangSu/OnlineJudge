package solutions._704_binary_search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecursiveSolutionTest {
	
	@Test
	public void search () {
		RecursiveSolution solution = new RecursiveSolution();
		Assert.assertEquals(4, solution.search(new int[]{-1,0,3,5,9,12}, 9));
		Assert.assertEquals(-1, solution.search(new int[]{-1,0,3,5,9,12}, 2));
	}
}
