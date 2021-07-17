package solutions._3_longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串（滑动窗口法）
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
public class BetterSolution {
	
	public int lengthOfLongestSubstring(String s) {
		int fast = 0;
		int slow = 0;
		int length = 0;
		Set<Character> set = new HashSet<>();
		while(fast < s.length()){
			if(!set.contains(s.charAt(fast))){
				set.add(s.charAt(fast));
				fast++;
				length = Math.max(set.size(), length);
			}else {
				// 若有重复的值，则慢指针加1，并移除set中的值，直至set中的值不重复为至，才开始移动快指针
				set.remove(s.charAt(slow));
				slow++;
			}
		}
		return length;
	}

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(n).
 */

