/**
 * @description 数字颠倒
 * @author GongchuangSu
 * @since 2016.08.07
 * @explain 输入一个整数，将这个整数以字符串的形式逆序输出程序不考虑负数的情况，
 *          若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * 			输入：输入一个int整数
 *          输出：将这个整数以字符串的形式逆序输出
 *          样例：输入1516000 输出 0006151
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String line = sc.nextLine();
    	char[] c = line.toCharArray();
    	StringBuffer sb = new StringBuffer();
    	for(int i = c.length - 1; i >= 0 ; i--){
    		sb.append(c[i]);
    	}
    	System.out.println(sb);
    }
}