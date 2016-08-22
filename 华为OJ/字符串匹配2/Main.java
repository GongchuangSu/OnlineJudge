/**
 * @description 字符串匹配
 * @author GongchuangSu
 * @since 2016.08.22
 * @explain 判断短字符串中的所有字符是否在长字符串中全部出现 
 *          输入：输入两个字符串。第一个为短字符，第二个为长字符。
 *          输出：返回值
 *          样例：
 *             输入：bc
 *                   abc
 *             输出：true
 * @知识点 字符串
 */

import java.util.*;

public class Main {
	
	public static boolean getResult(char[] c1, char[] c2){
		for(int i = 0; i < c1.length; i++){
			int j = 0;
			for( ; j < c2.length; j++){
				if(c1[i] == c2[j])
					break;
			}
			if(j == c2.length)
				return false;
		}
		return true;
	}
	
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		char[] c1 = sc.nextLine().toCharArray();
    		char[] c2 = sc.nextLine().toCharArray();
    		System.out.println(getResult(c1, c2));
    	}
    	sc.close();
    }
}