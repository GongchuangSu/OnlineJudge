package solutions._26_2_remove_duplicates_from_unsorted_array;

import org.junit.Test;

/**
 * @author GongchuangSu
 * @date 2019.11.10
 */
public class TestSolution {

    @Test
    public void test(){
       Solution solution = new Solution();
        int[] nums = new int[]{1,2,1,2};
        System.out.println(solution.removeDuplicates(nums));
    }

}
