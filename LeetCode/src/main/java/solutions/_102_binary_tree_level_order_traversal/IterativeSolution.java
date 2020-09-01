package solutions._102_binary_tree_level_order_traversal;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @Description
 *       Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * @Example
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 * @author GongchuangSu
 * @date 2020.09.01
 */
public class IterativeSolution {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if(root == null){
			return res;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()){
			int len = queue.size();
			List<Integer> rowData = new ArrayList<>();
			for(int i = 0; i < len; i++){
				TreeNode node = queue.poll();
				rowData.add(node.val);
				if(node.left != null){
					queue.add(node.left);
				}
				if(node.right != null){
					queue.add(node.right);
				}
			}
			res.add(rowData);
		}
		return res;
	}
	
}
