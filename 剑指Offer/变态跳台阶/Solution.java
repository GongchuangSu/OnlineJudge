/**
 * 题目描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 *           求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 解题思路：每个台阶都有跳与不跳两种情况（除了最后一个台阶），最后一个台阶必须跳。
 *           所以共有2^(n-1)中情况
 * 测试样例：
 *           输入：4
 *           输出：8
 * @author GongchuangSu
 * @since 2016.07.03
 */
public class Solution {
    public int JumpFloorII(int target) {
		if(target <= 0)
			return 0;
        return 1 << --target;
    }
}
//运行时间：28ms
//占用内存：629k