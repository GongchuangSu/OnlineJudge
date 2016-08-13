/**
 * @description 按字节截取字符串
 * @author GongchuangSu
 * @since 2016.08.13
 * @explain 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。
 *          但是要保证汉字不被截半个，如"我ABC"4，应该截为"我AB"，输入"我ABC汉DEF"6，应
 *          该输出为"我ABC"而不是"我ABC+汉的半个"。 
 *          输入：输入待截取的字符串及长度
 *          输出：截取后的字符串
 *          样例：
 *              输入：我ABC汉DEF
 *                    6
 *              输出：我ABC
 * @知识点 字符串
 */
import java.util.*;

public class Main {
	
	/**
	 * 功能：判断是否为中文字符
	 */
	public static boolean isChinese(char a) { 
	     int v = (int)a; 
	     return (v >= 19968 && v <= 171941); 
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {        	
        	char[] cs = sc.nextLine().toCharArray();
        	int length = Integer.valueOf(sc.nextLine());
        	StringBuffer sb = new StringBuffer();
        	int i = 0;
        	int j = 0;
        	while(j < length){              		
        		if(isChinese(cs[i])){        			        			
        			j += 2;
        			if(j < length)
        				sb.append(cs[i]);
        			i++;
        		}       			        			
        		else{
        			sb.append(cs[i]);
        			i++;
        			j++;
        		}   		
        	}
        	System.out.println(sb.toString());
        }
        sc.close();
    }
}