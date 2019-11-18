package solutions._703_kth_largest_element_in_a_stream;

import org.junit.Test;

/**
 * @author GongchuangSu
 * @date 2019.11.18
 */
public class SolutionTest {

    @Test
    public void test(){
        int k = 3;
        int[] arr = new int[]{4,5,8,2};
//        CommonSolution solution = new CommonSolution(k, arr);
        PriorityQueueSolution solution = new PriorityQueueSolution(k, arr);
        System.out.println(solution.add(3));
        System.out.println(solution.add(5));
        System.out.println(solution.add(10));
        System.out.println(solution.add(9));
        System.out.println(solution.add(4));
    }

}
