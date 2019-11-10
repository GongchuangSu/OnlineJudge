package solutions._1_two_sum;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author sugongchuang
 * @date 2019.11.08
 */
public class TestSolution1 {

    @Test
    public void test(){
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Solution1 solution1 = new Solution1();
        int[] result = solution1.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

}
