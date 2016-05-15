/**
 * 题目描述：输入一个整数，返回一个不小于该整数的最小的2的幂的值
 * 测试样例：
 *           输入：3
 *           输出：4
 * @author GongchuangSu
 * @since 2016.05.14
 */
public class Solution {
    public int roundUpToPowerOf2(int number){
		return number > 1 ? Integer.highestOneBit((number - 1) << 1 ) : 1;
	}
}
// 运行时间：34ms
// 占用内存：583k
