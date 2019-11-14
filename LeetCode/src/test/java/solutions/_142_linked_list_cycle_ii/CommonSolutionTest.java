package solutions._142_linked_list_cycle_ii;

import org.junit.Test;

/**
 * @author GongchuangSu
 * @date 2019.11.14
 */
public class CommonSolutionTest {

    @Test
    public void test(){
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        CommonSolution solution = new CommonSolution();
        System.out.println(solution.detectCycle(head) == null ? false : solution.detectCycle(head).val);
    }

    @Test
    public void test2(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        CommonSolution solution = new CommonSolution();
        System.out.println(solution.detectCycle(head) == null ? false : solution.detectCycle(head).val);
    }

    @Test
    public void test3(){
        ListNode head = new ListNode(1);
        CommonSolution solution = new CommonSolution();
        System.out.println(solution.detectCycle(head) == null ? false : solution.detectCycle(head).val);
    }

}
