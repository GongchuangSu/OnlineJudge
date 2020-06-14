package solutions._704_binary_search;

/**
 * 二分查找（递归法）
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
 * @see <a href="https://time.geekbang.org/column/article/42520">如何用最省内存的方式实现快速查找功能？</a>
 * @author GongchuangSu
 * @date 2020.06.14
 */
public class RecursiveSolution {
	
	public int search(int[] nums, int target) {
		return binarySearch(nums, 0, nums.length - 1, target);
	}
	
	private int binarySearch(int[] nums, int low, int high, int target){
		if(low > high){
			return -1;
		}
//			int mid = (low + high)/2;
//			int mid = low + (high - low)/2;
		int mid = low + ((high-low) >> 1);
		if(nums[mid] == target){
			return mid;
		}else if(nums[mid] < target){
			return binarySearch(nums, mid + 1, high, target);
		}else{
			return binarySearch(nums, low, mid - 1, target);
		}
	}
	
}

/** Complexity analysis
 * Time complexity : O(logn).
 * Space complexity:O(1).
 */
