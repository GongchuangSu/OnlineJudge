package bean;

/**
 * 节点定义
 * @author sugongchuang
 * @date 2019.11.13
 */
public class ListNode {
	
	public int val;
	
	public ListNode next;
	
	public ListNode() {}
 
	public ListNode(int x){
		val = x;
		next = null;
	}
	
	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
