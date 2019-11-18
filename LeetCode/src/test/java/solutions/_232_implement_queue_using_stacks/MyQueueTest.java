package solutions._232_implement_queue_using_stacks;

import org.junit.Test;

/**
 * @author GongchuangSu
 * @Description
 * @Example
 * @date 2019.11.18
 */
public class MyQueueTest {

    @Test
    public void test(){
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // returns 1
        System.out.println(queue.pop());   // returns 1
        System.out.println(queue.pop());   // returns 2
        System.out.println(queue.empty()); // returns false
    }

}
