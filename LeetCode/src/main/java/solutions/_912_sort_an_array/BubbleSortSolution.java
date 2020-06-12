package solutions._912_sort_an_array;

/**
 * 冒泡排序法
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
 * @see <a href="https://time.geekbang.org/column/article/41802">为什么插入排序比冒泡排序更受欢迎</a>
 * @author GongchuangSu
 * @date 2020.06.11
 */
public class BubbleSortSolution {
	
	public int[] sortArray(int[] nums) {
		bubbleSort(nums, nums.length);
		return nums;
	}
	
	private void bubbleSort(int[] nums, int n){
		if(n <= 1){
			return;
		}
		for(int i = 0; i < n; i++){
			// 提前退出循环标识
			boolean flag = false;
			for(int j = 0; j < n - i -1; j++){
				if(nums[j] > nums[j+1]){
					int tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
					flag = true;
				}
			}
			if(!flag){
				break;
			}
		}
	}
}
