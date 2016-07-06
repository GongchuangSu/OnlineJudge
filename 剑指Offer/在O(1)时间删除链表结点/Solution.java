/**
 * 题目描述：给定单向链表的头指针和一个结点指针，定义一个函数在O(1)时间
 *           删除该结点
 * 测试样例：
 *           输入：1->2->3->4->5->6->7->8->9->null 3
 *           输出：1->2->4->5->6->7->8->9->null
 * 解题思路：两个栈交换使用使其排序发生改变
 * @author GongchuangSu
 * @since 2016.07.06
 */
public class Solution {
//    /** 
//     * 链表结点 
//     */  
//    public static class ListNode {  
//        int value;     // 保存链表的值  
//        ListNode next; // 下一个结点  
//    }
    
    public static ListNode deleteNode(ListNode head, ListNode toBeDeleted) {
        // 如果输入参数有空值就返回表头结点  
        if (head == null || toBeDeleted == null) {
            return head;
        }
        // 如果删除的是头结点，直接返回头结点的下一个结点  
        if (head == toBeDeleted) {
            return head.next;
        }
        // 在多个节点的情况下，如果删除的是最后一个元素  
        if (toBeDeleted.next == null) {
            // 找待删除元素的前驱  
            ListNode tmp = head;
            while (tmp.next != toBeDeleted) {
                tmp = tmp.next;
            }
            // 删除待结点  
            tmp.next = null;
        } else { // 在多个节点的情况下，如果删除的是某个中间结点  
            // 将下一个结点的值输入当前待删除的结点    
            toBeDeleted.value = toBeDeleted.next.value;
            // 待删除的结点的下一个指向原先待删除引号的下下个结点，即将待删除的下一个结点删除  
            toBeDeleted.next = toBeDeleted.next.next;
        }
        // 返回删除节点后的链表头结点  
        return head;
    }
}