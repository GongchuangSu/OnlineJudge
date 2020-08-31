package solutions._104_maximum_depth_of_binary_tree;

import bean.TreeNode;
import org.junit.Test;
import utils.TreeUtils;

import static org.junit.Assert.*;

public class IterativeSolutionTest {
	
	@Test
	public void maxDepth () {
		IterativeSolution solution = new IterativeSolution();
		TreeNode root = TreeUtils.convert(new Integer[]{3,9,20,null,null,15,7});
		System.out.println(solution.maxDepth(root));
	}
}
