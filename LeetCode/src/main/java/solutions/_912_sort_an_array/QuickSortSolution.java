package solutions._912_sort_an_array;

/**
 * 快速排序法
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
public class QuickSortSolution {
	
	public int[] sortArray(int[] nums) {
		quickSort(nums, 0, nums.length - 1);
		return nums;
	}
	
	private void quickSort(int[] nums, int low, int high){
		if(low >= high){
			return;
		}
		int p = partition(nums, low, high);
		quickSort(nums, low, p - 1);
		quickSort(nums, p + 1, high);
	}
	
	private int partition(int[] nums, int low, int high){
		int pivot = nums[high];
		int i = low;
		for(int j = low; j < high; j++){
			if(nums[j] <= pivot){
				swap(nums, i, j);
				i = i + 1;
			}
		}
		swap(nums, i, high);
		return i;
	}
	
	/**
	 * 交换元素
	 * @param nums
	 * @param i
	 * @param j
	 */
	private void swap(int[] nums, int i, int j){
		if(i == j){
			return;
		}
		int k = nums[i];
		nums[i] = nums[j];
		nums[j] = k;
	}
}
