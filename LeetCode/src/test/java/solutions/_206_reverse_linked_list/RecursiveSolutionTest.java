package solutions._206_reverse_linked_list;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecursiveSolutionTest {
	
	@Test
	public void reverseList () {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		RecursiveSolution recursiveSolution = new RecursiveSolution();
		ListNode result = recursiveSolution.reverseList(head);
		System.out.print(result.val + "->");
		while (result.next != null){
			System.out.print(result.next.val + "->");
			result.next = result.next.next;
		}
		System.out.print("NULL");
	}
}
