/**
 * @description 求最小公倍数
 * @author GongchuangSu
 * @since 2016.08.09
 * @explain 功能:正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 *          输入：输入两个正整数A和B。
 *          输出：输出A和B的最小公倍数。
 *          样例：
 *              输入：5 7
 *              输出：35
 * @解题思路 根据最大公约数求最大公倍数        
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
            int num_1 = sc.nextInt();
            int num_2 = sc.nextInt();  
        	System.out.println(num_1 * num_2 / getMaxCommonDivisor(num_1, num_2));
    	}  	
    }
    
    // 求最大公约数
    public static int getMaxCommonDivisor(int m, int n){
    	if(m < n){
    		int temp = m;
    		m = n;
    		n = temp;
    	}
    	int k;
    	while(n != 0){
    		k = m % n;
    		m = n;
    		n = k;
    	}
    	return m;
    }
}