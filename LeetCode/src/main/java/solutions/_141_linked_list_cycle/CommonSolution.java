package solutions._141_linked_list_cycle;

import java.util.HashSet;
import java.util.Set;

/**
 * 保存每一个走过的节点，并判断之前是否走过(HashSet)
 * @Description
 *      Given a linked list, determine if it has a cycle in it.
 *      To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed)
 *      in the linked list where tail connects to.If pos is -1, then there is no cycle in the linked list.
 * @Example
 *      1. Input: head = [3,2,0,-4], pos = 1
 *         Output: true
 *         Explanation: There is a cycle in the linked list, where tail connects to the second node.
 *
 *      2. Input: head = [1,2], pos = 0
 *         Output: true
 *         Explanation: There is a cycle in the linked list, where tail connects to the first node.
 *
 *      3. Input: head = [1], pos = -1
 *         Output: false
 *         Explanation: There is no cycle in the linked list.
 * @author GongchuangSu
 * @date 2019.11.13
 */
public class CommonSolution {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        while (head.next != null){
            if (set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(n).
 */
