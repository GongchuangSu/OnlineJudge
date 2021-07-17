package solutions._3_longest_substring_without_repeating_characters;

import org.junit.Test;

public class BetterSolutionTest {
	
	@Test
	public void test(){
		BetterSolution solution = new BetterSolution();
		System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
		System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
		System.out.println(solution.lengthOfLongestSubstring("au"));
		System.out.println(solution.lengthOfLongestSubstring(""));
	}
	
}
