package solutions._206_reverse_linked_list;

/**
 * 迭代法反转链表
 * @Description
 *      Reverse a singly linked list
 * @Example
 *      Input: 1->2->3->4->5->NULL
 *      Output: 5->4->3->2->1->NULL
 * @author GongchuangSu
 * @date 2019.11.11
 */
public class IterativeSolution {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            // 先保存当前节点的后一节点
            ListNode nodeTemp = cur.next;
            // 将当前节点的下一节点的指针指向前一节点
            cur.next = pre;
            // 将前一节点指向当前节点
            pre = cur;
            // 将当前节点指向下一节点
            cur = nodeTemp;
        }
        return pre;
    }

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(1).
 */

