/**
 * @description （练习用）挑7
 * @author GongchuangSu
 * @since 2016.08.13
 * @explain 输出7有关数字的个数，包括7的倍数，还有包含7的数字（如17，27，37...70，71，72，73...）的个数
 *          输入：一个正整数N。(N不大于30000)
 *          输出：不大于N的与7有关的数字个数，例如输入20，与7有关的数字包括7,14,17.
 *          样例：
 *              输入：20
 *              输出：3
 * @知识点 字符串
 */
import java.util.*;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	int num = sc.nextInt();
        	int count = 0;        // 记录与7有关的数字个数
        	while(num > 6){
        		if(num % 7 == 0){ 
        			count++;
        			num--;
        		}else{            // 若不是7的倍数，则继续判断是否包含7
        			char[] cs = String.valueOf(num).toCharArray();
        			int i = 0;
        			for(i = 0; i < cs.length; i++){
        				if(cs[i] == '7')
        					break;
        			}
        			if(i != cs.length)
        				count++;
        			num--;       			
        		}        			
        	}  
        	System.out.println(count);
        }
        sc.close();
    }
}