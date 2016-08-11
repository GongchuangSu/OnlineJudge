/**
 * @description 自守数
 * @author GongchuangSu
 * @since 2016.08.11
 * @explain 自守数是指一个数的平方的尾数等于该数自身的自然数。例如：252 = 625，762 = 5776，93762 = 87909376。
 *          请求出n以内的自守数的个数
 *          输入：int型整数
 *          输出：n以内自守数的数量
 *          样例：
 *              输入：2000
 *              输出：8
 * @知识点      字符串、查找
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int count = 0;
            while(num >= 0){
            	long num_square = num * num;
            	char[] c1 = String.valueOf(num_square).toCharArray();
            	char[] c2 = String.valueOf(num).toCharArray();
            	int c1_length = c1.length;
            	int c2_length = c2.length;
            	int i;
            	for(i = 1; i <= c2_length; i++){
            		if(c1[c1_length - i] != c2[c2_length - i])
            			break;
            	}
            	if(i == c2_length + 1)
            		count++;
            	num--;
            }
            System.out.println(count);
        }
        sc.close();
    }
}