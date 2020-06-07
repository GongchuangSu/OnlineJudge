package solutions._239_sliding_window_maximum;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Description
 *      Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
 *      You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 *      Return the max sliding window.
 * @Example
 *      Input: nums = [1,3,-1,-3,5,3,6,7], and k = 3
 *      Output: [3,3,5,5,6,7]
 *      Explanation:
 *
 *      Window position                Max
 *      ---------------               -----
 *      [1  3  -1] -3  5  3  6  7       3
 *       1 [3  -1  -3] 5  3  6  7       3
 *       1  3 [-1  -3  5] 3  6  7       5
 *       1  3  -1 [-3  5  3] 6  7       5
 *       1  3  -1  -3 [5  3  6] 7       6
 *       1  3  -1  -3  5 [3  6  7]      7
 *
 *      Note:
 *      You may assume k is always valid, 1 ≤ k ≤ input array's size for non-empty array.
 * @author GongchuangSu
 * @date 2019.11.19
 */
public class MaxHeapSolution {

    public int[] maxSlidingWindow(int[] nums, int k) {
	    int len = nums.length;
	    int[] result = new int[len - k + 1];
	    if(nums.length == 0) {
	    	return new int[0];
	    }
	    Queue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>(){
		    @Override
		    public int compare(Integer i1, Integer i2){
			    return Integer.compare(i2, i1);
		    }
	    });
	
	    for(int i = 0; i < k; i ++){
		    queue.add(nums[i]);
	    }
	    result[0] = queue.peek();
	    for(int i = k; i < len; i ++){
		    queue.remove(nums[i - k]);
		    queue.add(nums[i]);
		    result[i - k + 1] = queue.peek();
	    }
	
	    return result;
    }

}

/** Complexity analysis
 * Time complexity : O(nlogk).
 * Space complexity: O(n).
 */
