package solutions._989_add_to_array_form_of_integer;

import org.junit.Test;

import java.util.List;


public class CommonSolutionTest {
	
	@Test
	public void addToArrayForm() {
		
		CommonSolution solution = new CommonSolution();
		List<Integer> list = solution.addToArrayForm(new int[]{1,2,0,0}, 34);
		for(Integer item : list){
			System.out.print(item);
		}
		System.out.println();
		List<Integer> list2 = solution.addToArrayForm(new int[]{1,6}, 84);
		for(Integer item : list2){
			System.out.print(item);
		}
	}
}
