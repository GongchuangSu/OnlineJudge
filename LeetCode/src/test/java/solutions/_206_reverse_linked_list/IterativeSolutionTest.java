package solutions._206_reverse_linked_list;

import org.junit.Test;

/**
 * @author GongchuangSu
 * @date 2019.11.11
 */
public class IterativeSolutionTest {

    @Test
    public void test(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        IterativeSolution iterativeSolution = new IterativeSolution();
        ListNode result = iterativeSolution.reverseList(head);
        System.out.print(result.val + "->");
        while (result.next != null){
            System.out.print(result.next.val + "->");
            result.next = result.next.next;
        }
        System.out.print("NULL");
    }

}
