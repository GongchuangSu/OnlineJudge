/**
 * @description iNOC产品部-杨辉三角的变形
 * @author GongchuangSu
 * @since 2016.08.09
 * @explain 功能:求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。
 *          输入：输入一个int整数
 *          输出：输出返回的int值
 *          样例：
 *              输入：4
 *              输出：3
 * @解题思路 找规律，当行数小于等于2时，输出-1
 *                  当行数对2求余得1时，输出2
 *                  当行数是4的倍数时，输出3
 *                  剩下的情况输出4      
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
            int num = sc.nextInt();
            if(num <= 2){
            	System.out.println("-1");
            	break;
            }
            else if(num % 2 == 1)
            	System.out.println("2");
            else{
            	if(num % 4 == 0)
            		System.out.println("3");
            	else
            		System.out.println("4");
            }            	
    	}
    	sc.close();
    }     
}