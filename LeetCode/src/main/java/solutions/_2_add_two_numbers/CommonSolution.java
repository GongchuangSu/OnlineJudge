package solutions._2_add_two_numbers;

import bean.ListNode;

/**
 * 两数相加（链表）
 * @Description
 *      You are given two non-empty linked lists representing two non-negative integers.
 *      The digits are stored in reverse order and each of their nodes contain a single digit.
 *      Add the two numbers and return it as a linked list.
 *
 *      You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * @Example
 *      Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *      Output: 7 -> 0 -> 8
 *      Explanation: 342 + 465 = 807.
 * @author GongchuangSu
 * @date 2020.03.19
 */
public class CommonSolution {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode cur = dummyHead;
		int carry = 0;
		while(l1 != null || l2 != null){
			int x = l1 == null ? 0 : l1.val;
			int y = l2 == null ? 0 : l2.val;
			
			int sum = x + y + carry;
			carry = sum / 10;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			
			l1 = l1 == null ? null : l1.next;
			l2 = l2 == null ? null : l2.next;
		}
		
		if(carry > 0){
			cur.next = new ListNode(carry);
		}
		
		return dummyHead.next;
	}
	
}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(n).
 */
