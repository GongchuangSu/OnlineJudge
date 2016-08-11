/**
 * @description 查找输入整数二进制中1的个数
 * @author GongchuangSu
 * @since 2016.08.11
 * @explain 
 *          输入：输入一个整数
 *          输出：计算整数二进制中1的个数
 *          样例：
 *              输入：5
 *              输出：2
 * @知识点      字符串、二进制
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            char[] cs = Integer.toBinaryString(num).toCharArray();
            int count = 0;
            for(int i = 0; i < cs.length; i++){
            	if(cs[i] == '1')
            		count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}