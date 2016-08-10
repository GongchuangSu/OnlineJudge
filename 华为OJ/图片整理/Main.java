/**
 * @description 图片整理
 * @author GongchuangSu
 * @since 2016.08.10
 * @explain Lily上课时使用字母数字图片教小朋友们学习英语单词，每次都需要把这些图片按照大小（ASCII码值从小到大）排列收好。
 *          请大家给Lily帮忙，通过C语言解决。
 *          输入：Lily使用的图片包括"A"到"Z"、"a"到"z"、"0"到"9"。输入字母或数字个数不超过1024。
 *          输出：Lily的所有图片按照从小到大的顺序输出
 *          样例：
 *              输入：Ihave1nose2hands10fingers
 *              输出：0112Iaadeeefghhinnnorsssv
 * @keypoint 字符串、排序
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		String str = sc.nextLine();
    		char[] cs = str.toCharArray();
    		Arrays.sort(cs);
    		System.out.println(cs);
    	}
    	sc.close();
    }     
}