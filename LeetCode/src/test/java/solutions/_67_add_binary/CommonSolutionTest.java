package solutions._67_add_binary;

import org.junit.Test;

public class CommonSolutionTest {
	
	@Test
	public void addBinary() {
		CommonSolution solution = new CommonSolution();
		System.out.println(solution.addBinary("11", "1"));
		System.out.println(solution.addBinary("1010", "1011"));
	}
}
