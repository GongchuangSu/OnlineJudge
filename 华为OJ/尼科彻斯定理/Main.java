/**
 * @description 尼科彻斯定理
 * @author GongchuangSu
 * @since 2016.08.11
 * @explain 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 *			例如：
 *			1^3=1 
 *			2^3=3+5 
 *			3^3=7+9+11 
 *			4^3=13+15+17+19 
 *          输入：输入一个int整数
 *          输出：输出分解后的string
 *          样例：
 *              输入：6
 *              输出：31+33+35+37+39+41
 * @知识点    字符串
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int num = sc.nextInt();
        	int m = 1;
        	int sum_left = 1;
        	for(int i = 0; i < 3; i++)
        		sum_left *= num;
        	while(true){
        		int sum_right = 0;
        		int n = m;
        		for(int j = 0; j < num; j++){
        			sum_right += n;
        			n += 2;
        		}
        		if(sum_left == sum_right){
        			StringBuffer sb = new StringBuffer();
        			for(int k = 0; k < num; k++){
        				sb.append(m + "+");
        				m = m + 2;
        			}
        			System.out.println(sb.substring(0, sb.length() - 1));
        			break;
        		}
        		m = m + 2;
        	}       	
        }
        sc.close();
    }
}