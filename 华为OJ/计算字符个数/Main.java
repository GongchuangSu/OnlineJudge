/**
 * @description 计算字符个数
 * @author GongchuangSu
 * @since 2016.08.07
 * @explain 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，
 *          然后输出输入字符串中含有该字符的个数。不区分大小写。
 * 			输入：输入一个有字母和数字以及空格组成的字符串，和一个字符。
 *          输出：输出输入字符串中含有该字符的个数。
 *          样例：
 *              输入：ABCDEF
 *                    A 
 *              输出 ：1
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char[] src = sc.nextLine().toUpperCase().toCharArray();
    	char des = sc.nextLine().toUpperCase().toCharArray()[0];
    	int count = 0;
    	for(char c : src ){
    		if(c == des)
    			count++;
    	}
    	System.out.println(count);   	
    }
}