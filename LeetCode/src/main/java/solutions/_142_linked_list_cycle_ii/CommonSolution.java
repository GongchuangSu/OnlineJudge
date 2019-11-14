package solutions._142_linked_list_cycle_ii;

import java.util.HashSet;
import java.util.Set;

/**
 * 保存每一个走过的节点，并判断之前是否走过(HashSet)
 * @Description
 *      Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *      To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed)
 *      in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 *      Note: Do not modify the linked list.
 * @Example
 *      1. Input: head = [3,2,0,-4], pos = 1
 *         Output: tail connects to node index 1
 *         Explanation: There is a cycle in the linked list, where tail connects to the second node.
 *
 *      2. Input: head = [1,2], pos = 0
 *         Output: tail connects to node index 0
 *         Explanation: There is a cycle in the linked list, where tail connects to the first node.
 *
 *      3. Input: head = [1], pos = -1
 *         Output: no cycle
 *         Explanation: There is no cycle in the linked list.
 * @author GongchuangSu
 * @date 2019.11.13
 */
public class CommonSolution {

    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode cur = head;
        Set<ListNode> set = new HashSet<>();
        while (cur.next != null){
            if (set.contains(cur)){
                return cur;
            }
            set.add(cur);
            cur = cur.next;
        }
        return null;
    }

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(n).
 */
