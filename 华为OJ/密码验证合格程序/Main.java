/**
 * @description 密码验证合格程序
 * @author GongchuangSu
 * @since 2016.08.19
 * @explain 密码要求:
 *               1.长度超过8位  
 *               2.包括大小写字母.数字.其它符号,以上四种至少三种   
 *               3.不能有相同长度超2的子串重复   说明:长度超过2的子串
 *          输入：一组或多组长度超过2的子符串。每组占一行
 *          输出：如果符合要求输出：OK，否则输出NG
 *          样例：
 *             输入：021Abc9000
 *                   021Abc9Abc1
 *                   021ABC9000
 *                   021$bc9000
 *             输出：OK
 *                   NG
 *                   NG
 *                   OK
 * @知识点 字符串、数组
 */

import java.util.*; 

public class Main { 
	
	/**
	 * 功能：判断长度是否满足要求
	 */
	public static boolean checkLength(String s){
		if(s.length() <= 8)
			return false;
		else
			return true;
	}
	
	/**
	 * 功能：判断符号种类个数是否满足要求
	 */
	public static boolean checkCharKinds(String s){
		int n1 = 0;      // 统计数字个数
		int n2 = 0;      // 统计小写字母个数
		int n3 = 0;      // 统计大写字母个数
		int n4 = 0;      // 统计其他字符个数
		int numType = 0; // 统计字符种类个数
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++){
			if(c[i] >= '0' && c[i] <= '9')
				n1++;
			else if(c[i] >= 'a' && c[i] <= 'z')
				n2++;
			else if(c[i] >= 'A' && c[i] <= 'Z')
				n3++;
			else 
				n4++;
		}
		if(n1 != 0)
			numType++;
		if(n2 != 0)
			numType++;
		if(n3 != 0)
			numType++;
		if(n4 != 0)
			numType++;
		if(numType < 3)
			return false;
		else
			return true;
	}
	
	/**
	 * 功能：判断是否有相同长度超过2的子串重复
	 */
	public static boolean checkCharRepeat(String s){
		int m = 3;
		while(m <= s.length()){
			HashSet<String> set = new HashSet<>();
			for(int i = 0; i <= s.length() - m; i++)
				set.add(s.substring(i, i + m));
			if(set.size() != (s.length() - m + 1))
				return false;
			m++;
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			boolean b1 = checkLength(s);
			boolean b2 = checkCharKinds(s);
			boolean b3 = checkCharRepeat(s);
			if(b1 && b2 && b3)
				System.out.println("OK");
			else
				System.out.println("NG");
		}
		sc.close();
    }
}