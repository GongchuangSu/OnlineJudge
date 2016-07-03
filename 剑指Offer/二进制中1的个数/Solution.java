/**
 * 题目描述：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 测试样例：
 *           输入：3
 *           输出：2
 * @author GongchuangSu
 * @since 2016.07.03
 */
public class Solution {
	public int  NumberOf1(int n) {
		int count = 0;
		char[] ch = Integer.toBinaryString(n).toCharArray();
		for(int i = 0;i < ch.length;i++)
			if(ch[i] == '1')
				count++;
        return count;
    }
}
//运行时间：34ms
//占用内存：654k