/**
 * @description 求int型数据在内存中存储时1的个数
 * @author GongchuangSu
 * @since 2016.08.08
 * @explain 输入一个int型数据，计算出该int型数据在内存中存储时1的个数。
 *          输入：输入一个整数（int类型）
 *          输出：这个数转换成2进制后，输出1的个数
 *          样例：
 *              输入：5
 *              输出：2
 *          
 * @解题思路 十进制转换为二进制
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] cs = Integer.toBinaryString(num).toCharArray();
        int count = 0;
        for(int i = 0; i < cs.length; i++){
        	if(cs[i] == '1')
        		count++;
        }
        System.out.println(count);
        sc.close();
    }
}