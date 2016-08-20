/**
 * @description 删除字符串中出现次数最少的字符
 * @author GongchuangSu
 * @since 2016.08.20
 * @explain 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。
 *          输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 *          输入：字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节
 *          输出：删除字符串中出现次数最少的字符后的字符串
 *          样例：
 *             输入：abcdd
 *             输出：dd
 * @知识点 字符串
 */

import java.util.*;

public class Main {
			
	public static String getResult(String s){
		char[] cs = s.toCharArray();
        int[] n = new int['z' - 'a' + 1];
        for(int i = 0; i < s.length(); i++){
        	n[cs[i] - 'a']++;
        }
        int min = Integer.MAX_VALUE;
        for(int j = 0; j < n.length; j++){
        	if(n[j] != 0 && n[j] < min)
        		min = n[j];
        	if(min == 1)
        		break;
        }
        StringBuffer sb = new StringBuffer();
        for(int k = 0; k < cs.length; k++){
        	if(n[cs[k] - 'a'] != min)
        		sb.append(cs[k]);
        }
        return sb.toString();
	}
	
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.println(getResult(s));
        }
        scanner.close();
    }
}