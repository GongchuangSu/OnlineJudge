package solutions._215_kth_largest_element_in_an_array;

/**
 * 快速排序法
 * @Description
 *      Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order,
 *      not the kth distinct element.
 * @Example
 * Example 1:
 *      Input: [3,2,1,5,6,4] and k = 2
 *      Output: 5
 *
 * Example 2:
 *      Input: [3,2,3,1,2,4,5,5,6] and k = 4
 *      Output: 4
 * @see <a href="https://time.geekbang.org/column/article/41913">如何用快排思想在O(n)内查找第K大元素</a>
 * @author GongchuangSu
 * @date 2020.06.09
 */
public class QuickSortSolution {
	
	public int findKthLargest(int[] nums, int k) {
		if(nums == null || nums.length < k){
			return -1;
		}
		
		int partition = partition(nums, 0, nums.length - 1);
		while (partition + 1 != k) {
			if (partition + 1 < k) {
				partition = partition(nums, partition + 1, nums.length - 1);
			} else {
				partition = partition(nums, 0, partition - 1);
			}
		}
		
		return nums[partition];
	}
	
	private int partition(int[] nums, int low, int high){
		int pivot = nums[high];
		int i = low;
		for(int j = low; j < high; j++){
			if(nums[j] >= pivot){
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
