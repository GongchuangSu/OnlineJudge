package solutions._4_median_of_two_sorted_arrays;

/**
 * 寻找两个正序数组的中位数（暴力求解法）
 * @author GongchuangSu
 * @Description
 *      Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * @Example
 * Example 1:
 *      Input: nums1 = [1,3], nums2 = [2]
 *      Output: 2.00000
 *      Explanation: merged array = [1,2,3] and median is 2.
 *
 * Example 2:
 *      Input: nums1 = [1,2], nums2 = [3,4]
 *      Output: 2.50000
 *      Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * @date 2021.07.17
 */
public class CommonSolution {
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i = 0;
		int j = 0;
		int c = nums1.length + nums2.length;
		int[] res = new int[c];
		int k = 0;
		while(i < nums1.length || j < nums2.length){
			if(i == nums1.length && j < nums2.length){
				res[k] = nums2[j];
				j++;
				k++;
				continue;
			}
			if(i < nums1.length && j == nums2.length){
				res[k] = nums1[i];
				i++;
				k++;
				continue;
			}
			if(nums1[i] <= nums2[j]){
				res[k] = nums1[i];
				i++;
			}else {
				res[k] = nums2[j];
				j++;
			}
			k++;
		}
		
		if(c % 2 == 0){
			return (res[c/2] + res[c/2-1]) / 2.0;
		}else {
			return res[c/2];
		}
	}
	
}

/** Complexity analysis
 * Time complexity : O(m+n).
 * Space complexity:O(m+n).
 */

