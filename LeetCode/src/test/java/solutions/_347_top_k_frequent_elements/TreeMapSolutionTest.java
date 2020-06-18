package solutions._347_top_k_frequent_elements;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeMapSolutionTest {
	
	@Test
	public void topKFrequent () {
		TreeMapSolution solution = new TreeMapSolution();
		System.out.println(Arrays.toString(solution.topKFrequent(new int[]{1,1,1,2,2,3}, 2)));
		System.out.println(Arrays.toString(solution.topKFrequent(new int[]{1,1,2,2,3}, 2)));
		System.out.println(Arrays.toString(solution.topKFrequent(new int[]{1}, 1)));
	}
}
