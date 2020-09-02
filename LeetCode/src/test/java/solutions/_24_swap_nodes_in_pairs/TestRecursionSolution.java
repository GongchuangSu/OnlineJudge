package solutions._24_swap_nodes_in_pairs;

import org.junit.Test;

/**
 * @author GongchuangSu
 * @date 2019.11.12
 */
public class TestRecursionSolution {

    @Test
    public void test(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RecursionSolution solution = new RecursionSolution();
        ListNode result = solution.swapPairs(head);
        System.out.print(result.val + "->");
        while (result.next != null){
            System.out.print(result.next.val + "->");
            result.next = result.next.next;
        }
    }
}
