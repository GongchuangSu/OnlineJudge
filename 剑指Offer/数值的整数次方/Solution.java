/**
 * 题目描述：给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 解题思路：主要考虑边界情况，exponent<=>0情况以及base=0的情况
 *           利用循环效率更高
 * 测试样例：
 *           输入：2,4    4，-1
 *           输出：16.0   0.25
 * @author GongchuangSu
 * @since 2016.07.06
 */
public class Solution {
    public double Power(double base, int exponent) {
        double result = 1;
        if (exponent == 0)
            return 1;
        if (base == 0) {
            return 0;
        }
        if (exponent > 0) {
            for (int i = 1; i <= exponent; i++) {
                result *= base;
                if (result > Double.MAX_VALUE) {
                    System.out.println("已经超出double类型的取值范围");
                    return -1;
                }
            }
            return result;
        }
        if (exponent < 0) {
            exponent = -exponent;
            for (int i = 1; i <= exponent; i++) {
                result *= base;
                if (result > Double.MAX_VALUE) {
                    System.out.println("已经超出double类型的取值范围");
                    return -1;
                }
            }
            return 1.0 / result;
        }
        return result;
    }
}
//运行时间：34ms
//占用内存：503k