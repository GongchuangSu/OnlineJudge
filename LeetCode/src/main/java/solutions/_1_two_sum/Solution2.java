package solutions._1_two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用HashTable求解
 * @Description：
 *       Given an array of integers, return indices of the two numbers such
 *       that they add up to a specific target.
 *       You may assume that each input would have exactly one solution.
 * @Example：
 *       Given nums = [2, 7, 11, 15], target = 9,
 *       Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 * @author GongchuangSu
 * @since 2016.05.29
 */

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(n).
 */
