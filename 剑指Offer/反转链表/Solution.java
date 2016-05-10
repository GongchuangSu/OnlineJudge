/**
 * 题目描述：输入一个链表，反转链表后，输出链表的所有元素。
 * 测试样例：
 *           输入：[1,3,5]
 *           输出：[5,3,1]
 * @author GongchuangSu
 * @since 2016.05.10
 */
//public class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode reverse = new ListNode(0);
		while(head != null){
			ListNode temp = new ListNode(head.val);
			temp.next = reverse.next;
			reverse.next = temp;
			head = head.next;
		}
		ListNode pNode = reverse.next;
        return pNode;
    }
}
// 运行时间：33ms
// 占用内存：629k