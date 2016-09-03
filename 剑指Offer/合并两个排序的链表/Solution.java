/**
 * 题目描述：输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 * 测试样例：
 *           输入：[1,3,5] [2,4,6]
 *           输出：[1,2,3,4,5,6]
 * @author GongchuangSu
 * @since 2016.05.10
 * @解题思路 本方法采用头插法，也可采用更简便的尾插法
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
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode list = new ListNode(0);
		while(list1 != null && list2 != null){
			if(list1.val < list2.val){
				ListNode temp = new ListNode(list1.val);
				temp.next = list.next;
				list.next = temp;
				list1 = list1.next;
			}else{
				ListNode temp = new ListNode(list2.val);
				temp.next = list.next;
				list.next = temp;
				list2 = list2.next;
			}
		}
		if(list1 != null){
			while(list1 != null){
				ListNode temp = new ListNode(list1.val);
				temp.next = list.next;
				list.next = temp;
				list1 = list1.next;
			}
		}
		if(list2 != null){
				while(list2 != null){
				ListNode temp = new ListNode(list2.val);
				temp.next = list.next;
				list.next = temp;
				list2 = list2.next;
			}
		}
		list = list.next;
		ListNode list3 = new ListNode(0);
		while(list != null){
			ListNode temp = new ListNode(list.val);
			temp.next = list3.next;
			list3.next = temp;
			list = list.next;
		}
		return list3.next;
    }
}
// 运行时间：34ms
// 占用内存：503k
