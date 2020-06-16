package solutions._290_word_pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @Description
 *      Given a pattern and a string str, find if str follows the same pattern.
 *      Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * @Example
 *  Example 1:
 *      Input: pattern = "abba", str = "dog cat cat dog"
 *      Output: true
 *
 *  Example 2:
 *      Input:pattern = "abba", str = "dog cat cat fish"
 *      Output: false
 *
 *  Example 3:
 *      Input: pattern = "aaaa", str = "dog cat cat dog"
 *      Output: false
 *
 *  Example 4:
 *      Input: pattern = "abba", str = "dog dog dog dog"
 *      Output: false
 * @author GongchuangSu
 * @date 2020.06.15
 * @tags 散列表
 */
public class CommonSolution {
	
	public boolean wordPattern(String pattern, String str) {
		if (pattern == null || "".equals(pattern) || str == null || "".equals(str)){
			return false;
		}
		String[] strs = str.split(" ");
		if(pattern.length() != strs.length){
			return false;
		}
		Map<Object, Object> map = new HashMap<>();
		for(int i = 0; i < strs.length; i++){
			// 利用 HashMap 方法特点，如果 hash(key) 已存在，则返回 oldValue
			if(!Objects.equals(map.put(pattern.charAt(i), i), map.put(strs[i], i))){
				return false;
			}
		}
		return true;
	}
	
}
