package solutions._24_swap_nodes_in_pairs;

/**
 * Iteration
 * @Description
 *      Given a linked list, swap every two adjacent nodes and return its head.
 *      You may not modify the values in the list's nodes, only nodes itself may be changed.
 * @Example
 *      Given 1->2->3->4, you should return the list as 2->1->4->3.
 * @author GongchuangSu
 * @date 2019.11.11
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = head;
        ListNode newHead = head.next;
        while(cur != null && cur.next != null){
            ListNode tempNode = cur;
            cur = cur.next;
            tempNode.next = cur.next;
            cur.next = tempNode;
            cur = tempNode.next;
            if(cur != null && cur.next != null){
                tempNode.next = cur.next;
            }

        }
        return newHead;
    }
}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(1).
 */
