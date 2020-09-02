package solutions.hj1;

import java.util.Scanner;

/**
 * [HJ1]字符串最后一个单词的长度
 * @Description
 *  计算字符串最后一个单词的长度，单词以空格隔开。
 *  输入描述:
 *      一行字符串，非空，长度小于5000。
 *  输出描述:
 *      整数N，最后一个单词的长度。
 * @Example
 *  输入:
 *      hello world
 *  输出:
 *      5
 * @author GongchuangSu
 * @date 2020.09.02
 */
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()){
			String str = sc.nextLine();
			String[] ss = str.split(" ");
			System.out.println(ss[ss.length - 1].length());
		}
	}
	
}
