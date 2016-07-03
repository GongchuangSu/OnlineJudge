/**
 * 题目描述：我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 *           请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 解题思路：斐波拉契数列：F(n) = F(n-1) + F(n-2)
 * 测试样例：
 *           输入：4
 *           输出：5
 * @author GongchuangSu
 * @since 2016.07.03
 */
public class Solution {
    public int RectCover(int target) {
        int result[] = {
            0, 1, 2
        };
        if (target < 3)
            return result[target];
        int fibNMinusOne = 1;
        int fibNMinusTwo = 2;
        int fibN = 0;
        for (int i = 3; i <= target; i++) {
            fibN = fibNMinusOne + fibNMinusTwo;
            fibNMinusOne = fibNMinusTwo;
            fibNMinusTwo = fibN;
        }
        return fibN;
    }
}
//运行时间：32ms
//占用内存：629k