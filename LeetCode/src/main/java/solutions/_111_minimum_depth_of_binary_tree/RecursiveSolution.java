package solutions._111_minimum_depth_of_binary_tree;

import bean.TreeNode;

/**
 * 递归法求解二叉树最小深度
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
 * @date 2020.08.31
 */
public class RecursiveSolution {
	
	public int minDepth(TreeNode root) {
		if(null == root){
			return 0;
		}
		if(root.left == null) { return minDepth(root.right) + 1;}
		if(root.right == null) { return minDepth(root.left) + 1;}
		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
	
}
