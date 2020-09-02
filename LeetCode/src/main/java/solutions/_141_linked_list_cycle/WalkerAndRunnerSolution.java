package solutions._141_linked_list_cycle;

/**
 * Walker and Runner(快慢指针法/龟兔赛跑法)
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
public class WalkerAndRunnerSolution {

    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next != null && runner.next.next != null){
            walker = walker.next;
            runner = runner.next.next;
            if(walker == runner){
                return true;
            }
        }
        return false;
    }

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(1).
 */
