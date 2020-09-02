package solutions.hj10;

import java.util.HashSet;
import java.util.Scanner;

/**
 * [HJ10]字符个数统计
 * @Description
 *      编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。
 *      不在范围内的不作统计。多个相同的字符只计算一次
 *  输入描述:
 *      输入N个字符，字符在ACSII码范围内。
 *  输出描述:
 *      输出范围在(0~127)字符的个数。
 * @Example
 *  输入:
 *      abc
 *  输出:
 *      3
 * @author GongchuangSu
 * @date 2020.09.02
 */
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			char[] cs = sc.nextLine().toCharArray();
			HashSet<Character> set = new HashSet<>();
			for(char c : cs){
				if((int) c >= 0 && (int) c <= 127) {
					set.add(c);
				}
			}
			System.out.println(set.size());
		}
	}
	
}
