package solutions._344_reverse_string;

import org.junit.Test;

/**
 * @author GongchuangSu
 * @date 2019.11.14
 */
public class CommonSolutionTest {

    @Test
    public void test(){
        char[] s = new char[]{'h','e','l','l','o'};
        CommonSolution solution = new CommonSolution();
        solution.reverseString(s);
        for(int i = 0; i < s.length; i++){
            System.out.print(s[i]);
        }
    }

}
