package solutions._111_minimum_depth_of_binary_tree;

import bean.TreeNode;
import org.junit.Test;
import utils.TreeUtils;

public class SolutionTest {
	
	@Test
	public void minDepth () {
		RecursiveSolution solution = new RecursiveSolution();
		TreeNode root = TreeUtils.convert(new Integer[]{3,9,20,null,null,15,7});
		System.out.println(solution.minDepth(root));
		
		root = TreeUtils.convert(new Integer[]{1,null,2});
		IteratvieSolution iteratvieSolution = new IteratvieSolution();
		System.out.println(iteratvieSolution.minDepth(root));
		
		root = TreeUtils.convert(new Integer[]{1,2,3,4,5});
		System.out.println(iteratvieSolution.minDepth(root));
		
		root = TreeUtils.convert(new Integer[]{1,2,3,4,null,null,5});
		System.out.println(iteratvieSolution.minDepth(root));
	}
}
