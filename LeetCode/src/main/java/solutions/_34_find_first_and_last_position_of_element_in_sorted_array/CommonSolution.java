package solutions._34_find_first_and_last_position_of_element_in_sorted_array;

/**
 * 二分查找法
 * @Description
 *      Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 *      Your algorithm's runtime complexity must be in the order of O(log n).
 *      If the target is not found in the array, return [-1, -1].
 * @Example
 *  Example 1:
 *      Input: nums = [5,7,7,8,8,10], target = 8
 *      Output: [3,4]
 *  Example 2:
 *      Input: nums = [5,7,7,8,8,10], target = 6
 *      Output: [-1,-1]
 * @see <a href="https://time.geekbang.org/column/article/42733">如何快速定位IP对应的省份地址？</a>
 * @author GongchuangSu
 * @date 2020.06.14
 */
public class CommonSolution {
	
	public int[] searchRange(int[] nums, int target) {
		if(nums.length < 1){
			return new int[]{-1, -1};
		}
		int[] result = new int[2];
		result[0] = findFirst(nums, nums.length - 1, target);
		result[1] = findLast(nums, nums.length - 1, target);
		return result;
	}
	
	/**
	 * 查找第一个值等于给定值的元素
	 * @param nums 数组
	 * @param n 数组最大下标值
	 * @param target 目标值
	 * @return 指定元素下标值
	 */
	private int findFirst(int[] nums, int n, int target){
		int low = 0;
		int high = n;
		while (low <= high){
			int mid = low + ((high-low) >> 1);
			if(nums[mid] == target){
				if(mid == 0 || nums[mid - 1] != target){
					return mid;
				}
				high = mid - 1;
			}else if(nums[mid] < target){
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	/**
	 * 查找最后一个值等于给定值的元素
	 * @param nums 数组
	 * @param n 数组最大下标值
	 * @param target 目标值
	 * @return 指定元素下标值
	 */
	private int findLast(int[] nums, int n, int target){
		int low = 0;
		int high = n;
		while (low <= high){
			int mid = low + ((high-low) >> 1);
			if(nums[mid] == target){
				if(mid == n || nums[mid + 1] != target){
					return mid;
				}
				low = mid + 1;
			}else if(nums[mid] < target){
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return -1;
	}
}

/** Complexity analysis
 * Time complexity : O(logn).
 * Space complexity:O(1).
 */
