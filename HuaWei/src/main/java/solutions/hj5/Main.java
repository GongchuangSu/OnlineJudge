package solutions.hj5;

import java.util.Scanner;

/**
 * [HJ5]进制转换
 * @Description
 *      写出一个程序，接受一个十六进制的数，输出该数值的十进制表示
 *  输入描述:
 *      输入一个十六进制的数值字符串。
 *  输出描述:
 *      输出该数值的十进制字符串。
 * @Example
 *  输入:
 *      0xA
 *  输出:
 *      10
 * @author GongchuangSu
 * @date 2020.09.02
 */
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()){
			String str = sc.nextLine();
			System.out.println(Integer.parseInt(str.substring(2), 16));
		}
	}
	
}
