package solutions._1_two_sum;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author sugongchuang
 * @date 2019.11.10
 */
public class TestSolution2 {

    @Test
    public void test(){
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Solution2 solution2 = new Solution2();
        int[] result = solution2.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

}
