package solutions._347_top_k_frequent_elements;

import java.util.*;

/**
 * TreeMap 基于红黑树（Red-Black tree）实现，该映射根据其键的自然顺序进行排序
 * @Description
 *      Given a non-empty array of integers, return the k most frequent elements
 *      Note:
 *      You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 *      Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 *      It's guaranteed that the answer is unique, in other words the set of the top k frequent elements is unique.
 *      You can return the answer in any order.
 * @Example
 *  Example 1:
 *      Input: nums = [1,1,1,2,2,3], k = 2
 *      Output: [1,2]
 *  Example 2:
 *      Input: nums = [1], k = 1
 *      Output: [1]
 * @author GongchuangSu
 * @date 2020.06.15
 * @tags TreeMap
 */
public class TreeMapSolution {
	
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		
		TreeMap<Integer, List<Integer>> freqMap = new TreeMap<>();
		for(int num : map.keySet()){
			Integer freq = map.get(num);
			if(!freqMap.containsKey(freq)){
				freqMap.put(freq, new ArrayList<>());
			}
			freqMap.get(freq).add(num);
		}
		
		List<Integer> list = new ArrayList<>();
		while (list.size() < k){
			Map.Entry<Integer, List<Integer>> entry = freqMap.pollLastEntry();
			list.addAll(entry.getValue());
		}
		
		int[] res = new int[k];
		for (int i = 0; i < k; i++){
			res[i] = list.get(i);
		}
		return res;
	}
	
}

/** Complexity analysis
 * Time complexity : O(nlogn).
 * Space complexity:O(n).
 */
