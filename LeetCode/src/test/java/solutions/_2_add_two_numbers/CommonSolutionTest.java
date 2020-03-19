package solutions._2_add_two_numbers;


import bean.ListNode;
import org.junit.Test;

public class CommonSolutionTest {
	
	@Test
	public void test(){
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
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
	
	@Test
	public void test2(){
		ListNode l1 = new ListNode(5);
		
		ListNode l2 = new ListNode(5);
		
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
