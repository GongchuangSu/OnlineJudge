package solutions._113_path_sum_ii;

import bean.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 递归
 * @Description
 *      Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 *      Note: A leaf is a node with no children.
 * @Example
 * Given the below binary tree and sum = 22,
 *
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \    / \
 * 7    2  5   1
 * Return:
 *
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 * @author GongchuangSu
 * @date 2020.04.04
 */
public class CommonSolution {
	
	public List<List<Integer>> pathSum(TreeNode root, int sum){
		List<List<Integer>> result  = new LinkedList<List<Integer>>();
		List<Integer> currentResult  = new LinkedList<Integer>();
		pathSum(root,sum,currentResult,result);
		return result;
	}
	
	public void pathSum(TreeNode root, int sum, List<Integer> currentResult,
	                    List<List<Integer>> result) {
		if (root == null) {
			return;
		}
		currentResult.add(new Integer(root.val));
		if (root.left == null && root.right == null && sum == root.val) {
			result.add(new LinkedList(currentResult));
			currentResult.remove(currentResult.size() - 1);
			return;
		} else {
			pathSum(root.left, sum - root.val, currentResult, result);
			pathSum(root.right, sum - root.val, currentResult, result);
		}
		currentResult.remove(currentResult.size() - 1);
	}

}
