/**
 * @description 字符串分隔
 * @author GongchuangSu
 * @since 2016.08.07
 * @explain 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 *          长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 			输入：连续输入字符串(输入2次,每个字符串长度小于100)
 *          输出：输出到长度为8的新字符串数组
 *          样例：
 *              输入：abc
 *                    123456789
 *              输出 ：abc00000
 *                    12345678
 *                    90000000
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	String str = new String();
        	for(int i =0; i < 2; i++){
        		String s1 = sc.nextLine();
        		if(s1.length() % 8 != 0)
        			s1 += "00000000";
        		for(int j = 0; j < s1.length()/8; j++){
        			str += (s1.substring(j*8, (j + 1)*8) + " ");
        		}
        	}
        	for(String s : str.split(" ")){
        		System.out.println(s);
        	}
        }
    }
}