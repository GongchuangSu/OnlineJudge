package solutions._104_maximum_depth_of_binary_tree;

import bean.TreeNode;
import org.junit.Test;
import utils.TreeUtils;

public class RecursiveSolutionTest {
	
	@Test
	public void maxDepth () {
		RecursiveSolution solution = new RecursiveSolution();
		TreeNode root = TreeUtils.convert(new Integer[]{3,9,20,null,null,15,7});
		System.out.println(solution.maxDepth(root));
	}
}
