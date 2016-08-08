/**
 * @description 提取不重复的整数
 * @author GongchuangSu
 * @since 2016.08.08
 * @explain 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 			输入：输入一个int型整数
 *          输出：按照从右向左的阅读顺序，返回一个不含重复数字的新的整数；如果返的整数以0开头，去掉0；
 *          样例：
 *              输入：9876673
 *              输出 ：37689
 * @解题思路 通过String的contains()方法判断是否包含某个字符
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	StringBuffer sb = new StringBuffer();
    	for(int i = str.length() - 1; i >= 0; i--){
    		if(!sb.toString().contains(str.substring(i, i+1)))
    		sb.append(str.substring(i, i+1));
    	}
    	System.out.println(Integer.valueOf(sb.toString()));
    	sc.close();
    }
}