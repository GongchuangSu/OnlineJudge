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
        ArrayList<Integer> pushList = new ArrayList<>();
		ArrayList<Integer> popList = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		
		if(pushA.length == 0 || popA.length == 0)
			return false;
		
		for(int i = 0; i < pushA.length; i++)
			pushList.add(pushA[i]);
		for(int i = 0; i < popA.length; i++)
			popList.add(popA[i]);
		
		int pushHead = 0;
		for(int i = 0; i < pushA.length; i++){
			if(pushA[i] == popA[0]){
				pushHead = i;
				break;
			}		
		}
		
		for(int j = 0; j <= pushHead; j++)
			temp.add(pushA[j]);
		
		while(pushList.size() != 0){
			if( temp.get(temp.size() -1) == popList.get(0)){
				temp.remove(pushHead);
				pushList.remove(pushHead);
				popList.remove(0);
				pushHead = pushHead - 1;
			}else{
				if(pushHead + 1 < pushList.size()){
					pushHead++;
				    temp.add(pushList.get(pushHead));
				}else
					break;				
			}
		}
		return pushList.size() == 0;
    }
}
// 运行时间：32ms
// 占用内存：654k