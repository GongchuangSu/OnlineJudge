package solutions._142_linked_list_cycle_ii;

/**
 * 快慢指针法
 * 1. 使用快慢指针判断是否有环，并找到相遇点
 * 2. 定义
 *      - L1：为起点与环的入口点之间距离
 *      - L2：为环的入口点与相遇点之间距离
 *      - C：为环的长度
 *      - n：为快指针绕环的圈数
 *    它们之间存在以下关系：
 *          2*(L1+L2) = L1+L2+n*C
 *    ==>   L1 = (n-1)*C + (C-L2)
 *    可以得出以下规律：
 *          同时从起点和相遇点出发，以相同的步伐，最终可以在环的入口处相遇
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
 * @date 2019.11.14
 */
public class WalkerAndRunnerSolution {

    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode walker = head;
        ListNode runner = head;
        ListNode entry  = head;
        while (runner.next != null && runner.next.next != null){
            runner = runner.next.next;
            walker = walker.next;
            if(walker == runner){
                while(entry != runner){
                    entry = entry.next;
                    runner = runner.next;
                }
                return entry;
            }
        }
        return null;
    }

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(1).
 */
