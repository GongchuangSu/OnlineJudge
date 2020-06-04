package solutions._234_palindrome_linked_list;

import bean.ListNode;

/**
 * 快慢指针法
 * @Description
 *      Given a singly linked list, determine if it is a palindrome.
 * @Example
 * Example 1:
 *      Input: 1->2
 *      Output: false
 *
 * Example 2:
 *      Input: 1->2->2->1
 *      Output: true
 * @author GongchuangSu
 * @date 2020.04.04
 * @link https://leetcode.com/problems/palindrome-linked-list/discuss/64501/Java-easy-to-understand
 */
public class CommonSolution {
	
	public boolean isPalindrome(ListNode head) {
		ListNode fast = head, slow = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		// odd nodes: let right half smaller
		if(fast != null){
			slow = slow.next;
		}
		
		slow = reverse(slow);
		fast = head;
		
		while (slow != null){
			if(slow.val != fast.val){
				return false;
			}
			slow = slow.next;
			fast = fast.next;
		}
		
		return true;
	}
	
	/**
	 * reverse list
	 * @param head
	 */
	private ListNode reverse(ListNode head){
		ListNode pre = null;
		while (head != null){
			ListNode next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}

}
