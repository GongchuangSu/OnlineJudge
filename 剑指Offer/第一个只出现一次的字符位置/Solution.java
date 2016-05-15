/**
 * 题目描述：在一个字符串(1<=字符串长度<=10000，全部由字母组成)
 *           中找到第一个只出现一次的字符的位置。若为空串，返回
 *           -1。位置索引从0开始。
 * 测试样例：
 *           输入："Google"
 *           输出：0
 * 解题思路：建立一个数组，统计每个字母出现的次数
 * @author GongchuangSu
 * @since 2016.05.15
 */
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str.length() == 0)
    		return -1;
    	char c = 'A';
        int[] counts = new int[52];
        for (int i = 0; i < str.length(); i++) {
            counts[str.charAt(i) - c]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (counts[str.charAt(i) - c] == 1){
                return i;
            }
        }
        return -1;
    }
}