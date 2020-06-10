package solutions._912_sort_an_array;

/**
 * 插入排序法
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
 * @date 2020.06.10
 */
public class InsertionSortSolution {
	
	public int[] sortArray(int[] nums) {
		insertionSort(nums, nums.length);
		return nums;
	}
	
	private void insertionSort(int[] nums, int n){
		if(n <= 1){
			return;
		}
		for(int i = 1; i < n; i++){
			// 每次要比较的元素
			int value = nums[i];
			// 查找要插入的位置并移动数据
			int j = i - 1;
			for(; j >= 0; j--){
				if(nums[j] > value){
					nums[j+1] = nums[j];
				}else{
					break;
				}
			}
			nums[j + 1] = value;
		}
	}
}

/** Complexity analysis
 * Time complexity : O(n*n).
 * Space complexity:O(1).
 * 插入排序是一种原地并稳定的排序算法
 */
