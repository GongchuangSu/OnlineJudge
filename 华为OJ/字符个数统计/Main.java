/**
 * @description 字符个数统计
 * @author GongchuangSu
 * @since 2016.08.08
 * @explain 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
 * 			输入：输入N个字符，字符在ACSII码范围内(0~127)。
 *          输出：输出字符的个数。
 *          样例：
 *              输入：abc
 *              输出 ：3
 * @解题思路 利用HashSet中没有重复对象的特性
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char[] c = sc.nextLine().toCharArray();
    	HashSet hashSet = new HashSet<>();
    	for(int i = 0; i < c.length; i++){
    		if((int)c[i] >= 0 && (int)c[i] <= 127){
    			hashSet.add(c[i]);
    		}
    	}
    	System.out.println(hashSet.size());
    }
}