/**
 * @description 等差数列
 * @author GongchuangSu
 * @since 2016.08.09
 * @explain 功能:等差数列 2，5，8，11，14。。。。
 *          输入：正整数N > 0
 *          输出：求等差数列前N项和
 *          样例：
 *              输入：2
 *              输出：7
 * @解题思路 等差数列和 result = N(3N + 1)/2         
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
        	String str = sc.nextLine();
        	char[] cs = str.toCharArray();
        	int i;
        	for(i = 0; i < cs.length; i++){
        		if(cs[i] < '0' || cs[i] > '9')
        			break;
        	}
        	if(i == cs.length){
        		int num = Integer.valueOf(str);
        		System.out.println(num*(3 * num + 1)/2);
        	} 	
    	}  	
    }
}