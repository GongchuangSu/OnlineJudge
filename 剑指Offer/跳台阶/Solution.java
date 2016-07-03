/**
 * 题目描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 *           求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 解题思路：对于第n个台阶来说，只能从n-1或者n-2的台阶跳上来，故
 *           斐波拉契数列：F(n) = F(n-1) + F(n-2)
 *           利用循环效率更高
 * 测试样例：
 *           输入：4
 *           输出：5
 * @author GongchuangSu
 * @since 2016.07.03
 */
public class Solution {
    public int JumpFloor(int target) {
        int result[] = {
            0, 1, 2
        };
        if (target < 3)
            return result[target];
        int floorOne = 1;
        int floorTwo = 2;
        int floorN = 0;
        for (int i = 3; i <= target; i++) {
            floorN = floorOne + floorTwo;
            floorOne = floorTwo;
            floorTwo = floorN;
        }
        return floorN;
    }
}
//运行时间：32ms
//占用内存：629k