package solutions._102_binary_tree_level_order_traversal;

import bean.TreeNode;
import org.junit.Test;
import utils.TreeUtils;

import java.util.List;

public class SolutionTest {
	
	@Test
	public void levelOrder () {
		TreeNode root = TreeUtils.convert(new Integer[]{3,9,20,null,null,15,7});
		IterativeSolution solution = new IterativeSolution();
		List<List<Integer>> res = solution.levelOrder(root);
		System.out.println(res);
	}
}
