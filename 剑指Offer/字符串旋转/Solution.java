/**
 * 题目描述：对于一个字符串，和字符串中的某一位置，请设计一个算法，
 *           将包括i位置在内的左侧部分移动到右边，将右侧部分移动到
 *           左边。给定字符串A和它的长度n以及特定位置p，请返回旋转
 *           后的结果。
 * 测试样例：
 *           输入："ABCDEFGH",8,4
 *           输出："FGHABCDE"
 * @author GongchuangSu
 * @since 2016.05.09
 */
public class Solution {
    public String rotateString(String A, int n, int p) {
        char[] temp = new char[n];
        A.getChars(0, p+1, temp, n - p -1);
        A.getChars(p+1, n, temp, 0);
        return String.valueOf(temp);
    }
}
// 运行时间：34ms
// 占用内存：583k
