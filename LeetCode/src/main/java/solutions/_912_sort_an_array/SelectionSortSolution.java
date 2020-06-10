package solutions._912_sort_an_array;

/**
 * 选择排序法
 * @Description
 *      Given an array of integers nums, sort the array in ascending order.
 * @Example
 *      Example 1:
 *      Input: nums = [5,2,3,1]
 *      Output: [1,2,3,5]
 *
 *      Example 2:
 *      Input: nums = [5,1,1,2,0,0]
 *      Output: [0,0,1,1,2,5]
 * @author GongchuangSu
 * @date 2020.06.10
 */
public class SelectionSortSolution {
	
	public int[] sortArray(int[] nums) {
		selectionSort(nums, nums.length);
		return nums;
	}
	
	private void selectionSort(int[] nums, int n){
		if(n <= 1){
			return;
		}
		for(int i = 0; i < n - 1; i++){
			// 查找最小值，并记录下标
			int minIndex = i;
			for(int j = i + 1; j < n; j++){
				if(nums[j] < nums[minIndex]){
					minIndex = j;
				}
			}
			// 交换元素
			int tmp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = tmp;
		}
	}

}
