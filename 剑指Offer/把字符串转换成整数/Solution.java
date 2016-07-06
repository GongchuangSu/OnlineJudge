/**
 * 题目描述：将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * 解题思路：注意特殊输入，考虑周全
 * 测试样例：
 *           输入：123  -123  -  -2,147,483,648
 *           输出：123  -123  0  -2,147,483,648
 * @author GongchuangSu
 * @since 2016.07.06
 */
public class Solution {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0) // 判断空对象或空字符串
            return 0;
        int result = 0;
        boolean isNegative = false;
        if (str.charAt(0) == '-') { // 判断正负号
            str = str.substring(1);
            isNegative = true;
        } else if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
                if (isNegative)
                    result = result * 10 - (str.charAt(i) - '0');
                else
                    result = result * 10 + (str.charAt(i) - '0');
            } else // 输入非数字字符
                return 0;
        }
        return result;
    }
}
// 运行时间：36ms
// 占用内存：629k