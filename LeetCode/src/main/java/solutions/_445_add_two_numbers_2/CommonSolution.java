package solutions._445_add_two_numbers_2;

import bean.ListNode;

import java.util.Stack;

/**
 *
 * @Description
 *      You are given two non-empty linked lists representing two non-negative integers.
 *      The most significant digit comes first and each of their nodes contain a single digit.
 *      Add the two numbers and return it as a linked list.
 *      You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * @Example
 *      Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 *      Output: 7 -> 8 -> 0 -> 7
 * @author GongchuangSu
 * @date 2020.03.22
 */
public class CommonSolution {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		
		while (l1 != null){
			s1.push(l1.val);
			l1 = l1.next;
		}
		
		while (l2 != null){
			s2.push(l2.val);
			l2 = l2.next;
		}
		
		int sum = 0;
		ListNode list = new ListNode(0);
		while(!s1.isEmpty() || !s2.isEmpty()){
			if(!s1.isEmpty()){
				sum += s1.pop();
			}
			if(!s2.isEmpty()){
				sum += s2.pop();
			}
			list.val = sum % 10;
			ListNode head = new ListNode(sum / 10);
			head.next = list;
			list = head;
			sum /= 10;
		}
		
		return list.val == 0 ? list.next : list;
	}
	
}
