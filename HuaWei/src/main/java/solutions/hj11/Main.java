package solutions.hj11;

import java.util.Scanner;

/**
 * [HJ11]数字颠倒
 * @Description
 *      输入一个整数，将这个整数以字符串的形式逆序输出
 *      程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 *  输入描述:
 *      输入一个int整数
 *  输出描述:
 *      将这个整数以字符串的形式逆序输出
 * @Example
 *  输入:
 *      1516000
 *  输出:
 *      0006151
 * @author GongchuangSu
 * @date 2020.09.02
 */
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			char[] cs = sc.nextLine().toCharArray();
			StringBuilder sb = new StringBuilder();
			for(int i = cs.length - 1; i >= 0; i--){
				sb.append(cs[i]);
			}
			System.out.println(sb.toString());
		}
	}
	
}
