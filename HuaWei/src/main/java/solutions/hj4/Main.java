package solutions.hj4;

import java.util.Scanner;

/**
 * [HJ4]字符串分割
 * @Description
 *      连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组
 *      长度不是8整数倍的字符串请在后面补数字0，空字符串不处理
 *  输入描述:
 *      连续输入字符串(输入2次,每个字符串长度小于100)
 *  输出描述:
 *      输出到长度为8的新字符串数组
 * @Example
 *  输入:
 *      abc
 *      123456789
 *  输出:
 *      abc00000
 *      12345678
 *      90000000
 * @author GongchuangSu
 * @date 2020.09.02
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()){
			StringBuilder sb = new StringBuilder(sc.nextLine());
			while (sb.length() >= 8){
				System.out.println(sb.substring(0, 8));
				sb.delete(0, 8);
			}
			if(sb.length() > 0){
				sb.append("00000000");
				System.out.println(sb.substring(0, 8));
			}
		}
	}
	
}
