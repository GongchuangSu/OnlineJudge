/**
 * 题目描述：输入一个链表，从尾到头打印链表每个节点的值。
 * 测试样例：
 *           输入：链表的表头
 *           输出：需要打印的“新链表”的表头
 * @author GongchuangSu
 * @since 2016.05.09
 */

//public class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
     	ArrayList<Integer> temp1 = new ArrayList<Integer>();
    	while(listNode != null){
    		temp.add(listNode.val);
    		listNode = listNode.next;
    	}
    	for(int i = temp.size() - 1; i >= 0 ; i--){
    		temp1.add(temp.get(i));
    	}
    	return temp1;
    }
}
// 运行时间：27ms
// 占用内存：629k