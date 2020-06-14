package solutions._704_binary_search;

/**
 * 二分查找（迭代法）
 * @Description
 *      Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums.
 *      If target exists, then return its index, otherwise return -1.
 * @Example
 *  Example 1:
 *      Input: nums = [-1,0,3,5,9,12], target = 9
 *      Output: 4
 *      Explanation: 9 exists in nums and its index is 4
 *
 *  Example 2:
 *      Input: nums = [-1,0,3,5,9,12], target = 2
 *      Output: -1
 *      Explanation: 2 does not exist in nums so return -1
 * @author GongchuangSu
 * @date 2020.06.14
 */
public class IterativeSolution {
	
	public int search(int[] nums, int target) {
		if(nums.length < 1){
			return -1;
		}
		int low = 0;
		int high = nums.length - 1;
		while (low <= high){
//			int mid = (low + high)/2;
//			int mid = low + (high - low)/2;
			int mid = low + ((high-low) >> 1);
			if(nums[mid] == target){
				return mid;
			}else if(nums[mid] < target){
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
}
