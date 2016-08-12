/**
 * @description 求最大连续bit数
 * @author GongchuangSu
 * @since 2016.08.12
 * @explain 求一个byte数字对应的二进制数字中1的最大连续个数，例如3的二进制为00000011，最大连续2个1
 *          输入：输入一个byte数字
 *          输出：输出转成二进制之后连续1的个数
 *          样例：
 *              输入：3
 *              输出：2
 * @知识点    字符串
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		int num = sc.nextInt();
    		char[] cs = Integer.toBinaryString(num).toCharArray();
    		int count = 0;
    		int i = 0;
    		while(i < cs.length){
    			int temp = 0;
    			if(cs[i] == '1'){
    				while(i < cs.length && cs[i] == '1'){
    					temp++;
    					i++;
    				}    							
    			}
    			count = temp > count ? temp : count;
    			i++;
    		}
        	System.out.println(count);
    	}
    	sc.close();
    }
}