package solutions._234_palindrome_linked_list;

import bean.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class CommonSolutionTest {
	
	@Test
	public void isPalindrome () {
		CommonSolution solution = new CommonSolution();
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		Assert.assertFalse(solution.isPalindrome(node));
		
		ListNode node2 = new ListNode(1);
		node2.next = new ListNode(2);
		node2.next.next = new ListNode(2);
		node2.next.next.next = new ListNode(1);
		Assert.assertTrue(solution.isPalindrome(node2));
		
		ListNode node3 = new ListNode(1);
		node3.next = new ListNode(2);
		node3.next.next = new ListNode(3);
		Assert.assertFalse(solution.isPalindrome(node3));
		
		ListNode node4 = new ListNode(1);
		node4.next = new ListNode(2);
		node4.next.next = new ListNode(1);
		Assert.assertTrue(solution.isPalindrome(node4));
	}
}
