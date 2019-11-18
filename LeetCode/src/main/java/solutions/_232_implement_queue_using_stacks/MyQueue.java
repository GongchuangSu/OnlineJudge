package solutions._232_implement_queue_using_stacks;

import java.util.Stack;

/**
 * @Description
 *      Implement the following operations of a queue using stacks.
 *          push(x) -- Push element x to the back of queue.
 *          pop() -- Removes the element from in front of queue.
 *          peek() -- Get the front element.
 *          empty() -- Return whether the queue is empty.
 * @Example
 *      MyQueue queue = new MyQueue();
 *      queue.push(1);
 *      queue.push(2);
 *      queue.peek();  // returns 1
 *      queue.pop();   // returns 1
 *      queue.empty(); // returns false
 * @author GongchuangSu
 * @date 2019.11.18
 */
public class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return output.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return output.isEmpty() && input.isEmpty();
    }

}

/** Complexity analysis
 * Time complexity : O(1).
 * Space complexity:O(n).
 */