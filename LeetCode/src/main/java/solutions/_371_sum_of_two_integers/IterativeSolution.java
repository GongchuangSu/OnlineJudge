package solutions._371_sum_of_two_integers;

/**
 * 迭代法：两整数相加（不使用加减符号）
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
public class IterativeSolution {
	
	public int getSum(int a, int b) {
		if (a == 0) {return b;}
		if (b == 0) {return a;}
		
		while (b != 0) {
			// 1. 考虑进位的加法：与运算并左移一位
			int carry = (a & b) << 1;
			// 2. 不考虑进位的加法：异或运算
			a = a ^ b;
			// 3. 重复上述两步操作，直至carry为0
			b = carry;
		}
		
		return a;
	}
	
}
