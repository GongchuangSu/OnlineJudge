/**
 * @description 进制转换
 * @author GongchuangSu
 * @since 2016.08.07
 * @explain 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 * 			输入：输入一个十六进制的数值字符串
 *          输出：输出该数值的十进制字符串
 *          样例：
 *              输入：0xA
 *              输出 ：10
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	String s = sc.nextLine().substring(2);
        	System.out.println(Integer.parseInt(s,16));
        }
    }
}