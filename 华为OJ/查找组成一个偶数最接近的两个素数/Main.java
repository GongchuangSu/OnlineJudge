/**
 * @description 查找组成一个偶数最接近的两个素数
 * @author GongchuangSu
 * @since 2016.08.11
 * @explain 任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，
 *          本题目要求输出组成指定偶数的两个素数差值最小的素数对
 *          输入：输入一个偶数
 *          输出：输出两个素数
 *          样例：
 *              输入：20
 *              输出：7 13
 * @知识点    字符串
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int num = sc.nextInt();
        	int primeMin = 0;
        	int primeMax = 0;
        	int diffMax = num - 2;
        	for(int i = 1; i < num/2 + 1; i++){
        		int m = i;
        		int n = num - i;       		
        		if(isPrime(m) && isPrime(n)){
        			if(n - m < diffMax){
        				diffMax = n - m;
        				primeMax = n;
        				primeMin = m;
        			}
        		}
        	}
        	System.out.println(primeMin);
        	System.out.println(primeMax);
        }
        sc.close();
    }
    
    /**
     * 功能：判断是否为素数
     */
    public static boolean isPrime(int num){
    	int m = 2;
    	while(m < num){
    		if(num % m == 0){
    			break;
    		}
    		m++;
    	}
    	if(m == num)
    		return true;
    	else
    		return false;	
    }
}