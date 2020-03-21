package solutions._371_sum_of_two_integers;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecursiveSolutionTest {
	
	@Test
	public void getSum() {
		RecursiveSolution solution = new RecursiveSolution();
		System.out.println(solution.getSum(1,2));
		System.out.println(solution.getSum(-1,2));
		System.out.println(solution.getSum(1,-1));
		System.out.println(solution.getSum(0,-1));
		System.out.println(solution.getSum(0,-0));
	}
}
