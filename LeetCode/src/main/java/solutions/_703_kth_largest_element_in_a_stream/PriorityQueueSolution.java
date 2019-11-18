package solutions._703_kth_largest_element_in_a_stream;

import java.util.PriorityQueue;

/**
 * Priority Queue优先队列
 * @Description
 *      Design a class to find the kth largest element in a stream.
 *      Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 *      Your KthLargest class will have a constructor which accepts an integer k and an integer array nums,
 *      which contains initial elements from the stream. For each call to the method KthLargest.add,
 *      return the element representing the kth largest element in the stream.
 * @Example
 *      int k = 3;
 *      int[] arr = [4,5,8,2];
 *      KthLargest kthLargest = new KthLargest(3, arr);
 *      kthLargest.add(3);   // returns 4
 *      kthLargest.add(5);   // returns 5
 *      kthLargest.add(10);  // returns 5
 *      kthLargest.add(9);   // returns 8
 *      kthLargest.add(4);   // returns 8
 * @author GongchuangSu
 * @date 2019.11.18
 */
public class PriorityQueueSolution {
    final int k;
    final PriorityQueue<Integer> queue;

    public PriorityQueueSolution(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for(int i = 0; i < nums.length; i++){
           add(nums[i]);
        }
    }

    public int add(int val){
        if(k > queue.size()){
            queue.add(val);
        }else if(queue.peek() < val){
            queue.poll();
            queue.add(val);
        }
        return queue.peek();
    }
}

/** Complexity analysis
 * Time complexity : O(nlog2k).
 * Space complexity: O(n).
 */