package solutions._290_word_pattern;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommonSolutionTest {
	
	@Test
	public void wordPattern () {
		CommonSolution solution = new CommonSolution();
		Assert.assertTrue(solution.wordPattern("abba", "dog cat cat dog"));
		Assert.assertFalse(solution.wordPattern("abba", "dog cat cat fish"));
		Assert.assertFalse(solution.wordPattern("aaa", "dog cat cat dog"));
		Assert.assertFalse(solution.wordPattern("abba", "dog dog dog dog"));
		Assert.assertTrue(solution.wordPattern("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd",
				"s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t"));
	}
}
