/**
 * @description 简单密码
 * @author GongchuangSu
 * @since 2016.08.13
 * @explain 具体描述请参照同目录下的README
 *          输入：输入包括多个测试数据。输入是一个明文，密码长度不超过100个字符，输入直到文件结尾
 *          输出：输出渊子真正的密文
 *          样例：
 *              输入：YUANzhi1987
 *              输出：zvbo9441987
 * @知识点 字符串
 */
import java.util.*;

public class Main {
	
	/**
	 * 功能：大写字母转变成对应的小写子母并往后移一位
	 * 注意：'z'向后移一位是'a'
	 */
	public static char upperCase(char c){
		if(c != 'Z')
			return (char)((int)c + 1 + 32);
		else 
			return 'a';		
	}
	
	/**
	 * 功能：小写字母转变成数字
	 */
	public static int lowerCase(char c){
		int num = 0;
		switch(c){
			case 'a':
			case 'b':
			case 'c':
				num = 2;
				break;
			case 'd':
			case 'e':
			case 'f':
				num = 3;
				break;
			case 'g':
			case 'h':
			case 'i':
				num = 4;
				break;
			case 'j':
			case 'k':
			case 'l':
				num = 5;
				break;
			case 'm':
			case 'n':
			case 'o':
				num = 6;
				break;
			case 'p':
			case 'q':
			case 'r':
			case 's':
				num = 7;
				break;
			case 't':
			case 'u':
			case 'v':
				num = 8;
				break;
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				num = 9;
				break;
		}
		return num;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	char[] cs = sc.nextLine().toCharArray();
        	StringBuffer sb = new StringBuffer();
        	for(int i = 0; i < cs.length; i++){
        		if(cs[i] >= 'A' && cs[i] <= 'Z')
        			sb.append(upperCase(cs[i]));
        		else if(cs[i] >= 'a' && cs[i] <= 'z')
        			sb.append(lowerCase(cs[i]));
        		else 
        			sb.append(cs[i]);
        	}
        	System.out.println(sb.toString());
        }
        sc.close();
    }
}