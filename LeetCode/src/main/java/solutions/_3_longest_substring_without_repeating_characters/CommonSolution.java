package solutions._3_longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串（暴力求解法）
 * @author GongchuangSu
 * @Description
 *      Given a string s, find the length of the longest substring without repeating characters.
 * @Example
 * Example 1:
 *      Input: s = "abcabcbb"
 *      Output: 3
 *      Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 *      Input: s = ""
 *      Output: 0
 * @date 2021.07.17
 */
public class CommonSolution {
	
	public int lengthOfLongestSubstring(String s) {
		if(s == null || "".equals(s)){
			return 0;
		}
		int max = 1;
		Set<Character> set;
		for(int i = 0; i < s.length(); i++) {
			set = new HashSet<>();
			for(int j = i; j < s.length(); j++){
				if(set.contains(s.charAt(j))){
					break;
				}
				set.add(s.charAt(j));
			}
			max = Math.max(set.size(), max);
		}
		return max;
	}

}

/** Complexity analysis
 * Time complexity : O(n^3).
 * Space complexity:O(n).
 */

