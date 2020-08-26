package solutions._206_reverse_linked_list;

/**
 * 递归法反转列表
 * @Description
 *      Reverse a singly linked list
 * @Example
 *      Input: 1->2->3->4->5->NULL
 *      Output: 5->4->3->2->1->NULL
 * @author sugongchuang
 * @see <a href="https://leetcode.com/problems/reverse-linked-list/solution">递归求解思路</a>
 * @date 2020.08.26
 */
public class RecursiveSolution {
	
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null){
			return head;
		}
		ListNode p = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return p;
	}
	
}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(n).
 */

