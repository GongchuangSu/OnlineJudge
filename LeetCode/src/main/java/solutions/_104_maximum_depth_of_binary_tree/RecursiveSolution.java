package solutions._104_maximum_depth_of_binary_tree;

import bean.TreeNode;

/**
 * 递归法求解二叉树深度
 * @Description
 *      Given a binary tree, find its maximum depth.
 *      The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * @Example
 *      Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 * @author GongchuangSu
 * @date 2020.07.12
 */
public class RecursiveSolution {
	
	public int maxDepth(TreeNode root) {
		if(null == root){
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

}
