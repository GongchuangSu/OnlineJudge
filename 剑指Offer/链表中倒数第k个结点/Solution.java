/**
 * 题目描述：输入一个链表，输出该链表中倒数第k个结点。
 * 测试样例：
 *           输入：[1,2,3,4,5] 2
 *           输出：[4,5]
 * 解题思路：两个指针，先让第一个指针和第二个指针都指向头结点，
 *           然后再让第一个指正走(k-1)步，到达第k个节点。然后
 *           两个指针同时往后移动，当第一个结点到达末尾的时候，
 *           第二个结点所在位置就是倒数第k个节点了。
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
    public ListNode FindKthToTail(ListNode head,int k) {
		if(head == null || k <= 0)
			return null;
		ListNode list1 = head;
		ListNode list2 = head;
		for(int i = 1; i < k; i++){
			if(list1 == null)
				return null;
			list1 = list1.next;
		}
		if(list1 == null)
		    return null;
		while(list1.next != null){
			list2 = list2.next;
			list1 = list1.next;
		}
		return list2;
    }
}
// 运行时间：30ms
// 占用内存：503k