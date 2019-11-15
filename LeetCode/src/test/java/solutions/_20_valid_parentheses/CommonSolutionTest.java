package solutions._20_valid_parentheses;

import org.junit.Test;

/**
 * @author GongchuangSu
 * @date 2019.11.15
 */
public class CommonSolutionTest {

    @Test
    public void test(){
//        String s = "()";
//        String s = "()[]{}";
//        String s = "(]";
        String s = "([)]";
//        String s = "{[]}";
        CommonSolution solution = new CommonSolution();
        System.out.print(solution.isValid(s));
    }
}
