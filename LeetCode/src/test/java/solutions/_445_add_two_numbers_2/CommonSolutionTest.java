package solutions._445_add_two_numbers_2;

import bean.ListNode;
import org.junit.Test;

public class CommonSolutionTest {
	
	@Test
	public void addTwoNumbers() {
		ListNode l1 = new ListNode(7);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		l1.next.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		CommonSolution solution = new CommonSolution();
		ListNode result = solution.addTwoNumbers(l1, l2);
		while (result != null){
			System.out.print(result.val);
			if(result.next != null){
				System.out.print("->");
			}
			result = result.next;
		}
	}
}
