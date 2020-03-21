package solutions._371_sum_of_two_integers;

/**
 * 递归法：两整数相加（不使用加减符号）
 * @Description
 *      Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * @Example
 *      1.  Input: a = 1, b = 2
 *          Output: 3
 *
 *      2.  Input: a = -2, b = 3
 *          Output: 1
 * @author GongchuangSu
 * @date 2020.03.19
 * @see <a href="https://www.jianshu.com/p/7bba031b11e7">位运算实现加、减、乘、除运算</a>
 */
public class RecursiveSolution {
	
	public int getSum(int a, int b) {
		return (b == 0) ? a : getSum(a ^ b, (a & b) << 1);
	}

}
