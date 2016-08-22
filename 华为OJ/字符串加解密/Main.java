/**
 * @description 字符串加解密
 * @author GongchuangSu
 * @since 2016.08.22
 * @explain 1、对输入的字符串进行加解密，并输出。
 *          2、加密方法为：当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,
 *             如字母a时则替换为B；字母Z时则替换为a；当内容是数字时则把该数字加1，如0替换1，1替
 *             换2，9替换0；其他字符不做变化。
 *          3、解密方法为加密的逆过程。
 *          输入：输入一串要加密的密码
 *                输入一串加过密的密码
 *          输出：输出加密后的字符
 *                输出解密后的字符
 *          样例：
 *             输入：abcdefg
 *                   BCDEFGH
 *             输出：BCDEFGH
 *                   abcdefg
 * @知识点 字符串
 */

import java.util.*;

public class Main {
	
	public static char encryption(char c){
		if(c >= 'a' && c < 'z')
			return (char)(c + 1 - 32);
		else if(c == 'z')
			return 'A';
		else if(c >= 'A' && c < 'Z')
			return (char)(c + 1 + 32);
		else if(c == 'Z')
			return 'a';
		else if(c >= '0' && c < '9')
			return (char)(c + 1);
		else if(c == '9')
			return '0';
		else 
			return c;
	}
	
	public static char decryption(char c){
		if(c > 'a' && c <= 'z')
			return (char)(c - 1 - 32);
		else if(c == 'a')
			return 'Z';
		else if(c > 'A' && c <= 'Z')
			return (char)(c - 1 + 32);
		else if(c == 'A')
			return 'z';
		else if(c > '0' && c <= '9')
			return (char)(c - 1);
		else if(c == '0')
			return '9';
		else 
			return c;
	}
	
	public static String enCryption(String s){
		char[] cs = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < cs.length; i++){
			sb.append(encryption(cs[i]));
		}
		return sb.toString();
	}
	
	public static String deCryption(String s){
		char[] cs = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < cs.length; i++){
			sb.append(decryption(cs[i]));
		}
		return sb.toString();
	}
	
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		String s1 = sc.nextLine();
    		String s2 = sc.nextLine();
    		System.out.println(enCryption(s1));
    		System.out.println(deCryption(s2));
    	}
    	sc.close();
    }
}