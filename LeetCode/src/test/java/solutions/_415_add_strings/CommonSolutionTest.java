package solutions._415_add_strings;

import org.junit.Test;

public class CommonSolutionTest {
	
	@Test
	public void addStrings() {
		CommonSolution solution = new CommonSolution();
		System.out.println(solution.addStrings("123456", "111000"));
		System.out.println(solution.addStrings("123456", "111100"));
		System.out.println(solution.addStrings("123456", "111110"));
		System.out.println(solution.addStrings("0", "0"));
	}
}
