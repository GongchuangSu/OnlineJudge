/**
 * 题目描述：请实现一个函数，将一个字符串中的空格替换成"%20"。
 * 测试样例：
 *           输入："We Are Happy"
 *           输出："We%20Are%20Happy"
 * @author GongchuangSu
 * @since 2016.05.09
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
		if(str == null)
			return null;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str.replace(i, i + 1, "%20");
            }
        }
		 return str.toString();
    }
}
// 运行时间：35ms
// 占用内存：550k