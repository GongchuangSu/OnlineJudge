package solutions._24_swap_nodes_in_pairs;

/**
 * Recursion
 * @Description
 *      Given a linked list, swap every two adjacent nodes and return its head.
 *      You may not modify the values in the list's nodes, only nodes itself may be changed.
 * @Example
 *      Given 1->2->3->4, you should return the list as 2->1->4->3.
 * @author sugongchuang
 * @date 2019.11.11
 */
public class SolutionRecursion {

    public ListNode swapPairs(ListNode head) {
        if ((head == null)||(head.next == null)) {
            return head;
        }
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(1).
 */