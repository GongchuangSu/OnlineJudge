package solutions._239_sliding_window_maximum;

import java.util.ArrayDeque;
import java.util.Deque;

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
public class DequeSolution {

    public int[] maxSlidingWindow(int[] nums, int k) {
	    // assume nums is not null
	    int n = nums.length;
	    if (n == 0 || k == 0) {
		    return new int[0];
	    }
	    // number of windows
	    int[] result = new int[n - k + 1];
	    // stores indices
	    Deque<Integer> win = new ArrayDeque<>();
	
	    for (int i = 0; i < n; ++i) {
		    // remove indices that are out of bound
		    while (win.size() > 0 && win.peekFirst() <= i - k) {
			    win.pollFirst();
		    }
		    // remove indices whose corresponding values are less than nums[i]
		    while (win.size() > 0 && nums[win.peekLast()] < nums[i]) {
			    win.pollLast();
		    }
		    // add nums[i]
		    win.offerLast(i);
		    // add to result
		    if (i >= k - 1) {
			    result[i - k + 1] = nums[win.peekFirst()];
		    }
	    }
	    return result;
    }

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(k).
 */
