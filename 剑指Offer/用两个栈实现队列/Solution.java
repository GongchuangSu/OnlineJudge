/**
 * 题目描述：用两个栈来实现一个队列，完成队列的Push和Pop操作。 
 *           队列中的元素为int类型。(队列为先进先出)
 * 测试样例：
 *           输入：push(1)、push(2)、push(3)、pop()、pop()
                   push(4)、push(5)、pop()、pop()
 *           输出：1 2 3 4 5
 * 解题思路：两个栈交换使用使其排序发生改变
 * @author GongchuangSu
 * @since 2016.05.11
 */
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	while(!stack2.isEmpty()){
    		stack1.push(stack2.pop());
    	}
        stack1.push(node);
    }
    
    public int pop() {
    	while(!stack1.isEmpty()){
    		stack2.push(stack1.pop());
    	}
    	return stack2.pop();
    }
}
// 运行时间：35ms
// 占用内存：654k