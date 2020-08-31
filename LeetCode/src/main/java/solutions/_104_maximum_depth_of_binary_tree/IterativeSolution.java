package solutions._104_maximum_depth_of_binary_tree;

import bean.TreeNode;

import java.util.Stack;

/**
 * 迭代法求解二叉树深度（DFS深度优先搜索）
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
 * @date 2020.08.31
 */
public class IterativeSolution {
	
	public int maxDepth(TreeNode root) {
		if(null == root){
			return 0;
		}
		Stack<TreeNode> stack = new Stack<>();
		Stack<Integer> value = new Stack<>();
		stack.push(root);
		value.push(1);
		int max = 0;
		while (!stack.isEmpty()){
			TreeNode node = stack.pop();
			int tmp = value.pop();
			max = Math.max(max, tmp);
			if(node.left != null){
				stack.push(node.left);
				value.push(tmp + 1);
			}
			if(node.right != null){
				stack.push(node.right);
				value.push(tmp + 1);
			}
		}
		return max;
	}

}
