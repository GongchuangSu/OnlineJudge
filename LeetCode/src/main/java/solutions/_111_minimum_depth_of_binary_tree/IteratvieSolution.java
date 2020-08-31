package solutions._111_minimum_depth_of_binary_tree;

import bean.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 迭代法求解二叉树最小深度（BFS广度优先搜索）
 * @Description
 *      Given a binary tree, find its minimum depth.
 *      The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 *      Note: A leaf is a node with no children.
 * @Example
 *      Given binary tree [3,9,20,null,null,15,7],
 *            3
 *           / \
 *          9  20
 *            /  \
 *          15   7
 *      return its minimum depth = 2.
 * @author GongchuangSu
 * @date 2020.09.01
 */
public class IteratvieSolution {
	
	public int minDepth(TreeNode root) {
		if(null == root){
			return 0;
		}
		List<TreeNode> list = new LinkedList<>();
		list.add(root);
		int level = 1;
		while (!list.isEmpty()){
			int len = list.size();
			// 按层遍历
			for(int i = 0; i < len; i++){
				TreeNode node = list.remove(0);
				if(node.left == null && node.right == null){
					return level;
				}
				if(node.left != null) {
					list.add(node.left);
				}
				if(node.right != null){
					list.add(node.right);
				}
			}
			level++;
		}
		return 0;
	}
	
}
