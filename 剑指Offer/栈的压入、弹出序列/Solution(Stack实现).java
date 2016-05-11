/**
 * 题目描述：输入两个整数序列，第一个序列表示栈的压入顺序，请
 *           判断第二个序列是否为该栈的弹出顺序。假设压入栈的
 *           所有数字均不相等。
 * 测试样例：
 *           若[1,2,3,4,5]为栈的压入顺序，则
 *             [4,5,3,2,1]为栈的一个弹出序列
 *             [4,3,5,1,2]则不是其弹出序列
 * @author GongchuangSu
 * @since 2016.05.11
 */
import java.util.*;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
      if(pushA.length == 0 || popA.length == 0)
			return false;
		Stack<Integer> stack = new Stack<>();
		int popHead = 0;
		for(int i = 0; i < pushA.length; i++){
			stack.push(pushA[i]);
			while( popHead < popA.length && stack.peek() == popA[popHead]){
				stack.pop();
				popHead++;
			}
		}
		return stack.size() == 0;
    }
}
// 运行时间：32ms
// 占用内存：688k