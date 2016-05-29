/**
 * @Description：
 *       Given a unsorted array, remove the duplicates in place such that each 
 *       element appear only once and return the new length. 
 *       Do not allocate extra space for another array, you must do this in 
 *       place with constant memory.
 * @Example：
 *       Given input array nums = [1,1,2],
 *       Your function should return length = 2, with the first two elements
 *       of nums being 1 and 2 respectively. It doesn't matter what you leave 
 *       beyond the new length.
 * @author GongchuangSu
 * @since 2016.05.29
 */

public class Solution {
    public int removeDuplicates(int[] nums) {
		int i = 0;
    	int n = nums.length;
    	if(n == 0)
    		return 0;
    	while(i != n - 1 && i <= n - 1){
    		for(int j = i + 1; j <= n - 1; j++){
    			if(nums[i] == nums[j]){
    				nums[j] = nums[n-1];
    				n--;
    			}
    		}
    		if(nums[n-1] != nums[i])
    			i++;
    	}
        return n;
    }
}

/** Complexity analysis
* Time complexity : O(n). 
* Space complexity:O(1).
*/