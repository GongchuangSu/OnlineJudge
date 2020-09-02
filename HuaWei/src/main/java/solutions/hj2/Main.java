package solutions.hj2;

import java.util.Scanner;

/**
 * [HJ2]计算字符个数
 * @Description
 *  写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 *  输入描述:
 *      第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。
 *  输出描述:
 *      输出输入字符串中含有该字符的个数。
 * @Example
 *  输入:
 *      ABCDEF
 *      A
 *  输出:
 *      1
 * @author GongchuangSu
 * @date 2020.09.02
 */
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] source = sc.nextLine().toLowerCase().toCharArray();
		char target = sc.nextLine().toLowerCase().toCharArray()[0];
		int count = 0;
		for (char c : source) {
			if (target == c) {
				count++;
			}
		}
		System.out.println(count);
	}
	
}
