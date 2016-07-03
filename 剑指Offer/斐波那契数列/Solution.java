/**
 * 题目描述：大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * 测试样例：
 *           输入：2
 *           输出：1
 * 注意：如果用递归，其效率会相当低，时间复杂度会以n的指数倍递增
 *       如果用循环，时间复杂度为O(n)
 * @author GongchuangSu
 * @since 2016.07.03
 */

public class Solution {
    public int Fibonacci(int n) {
        int result[] = {
            0, 1
        };
        if (n < 2)
            return result[n];
        int fibNMinusOne = 1;
        int fibNMinusTwo = 0;
        int fibN = 0;
        for (int i = 2; i <= n; i++) {
            fibN = fibNMinusOne + fibNMinusTwo;
            fibNMinusTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }
        return fibN;
    }
}
//运行时间：34ms
//占用内存：528k