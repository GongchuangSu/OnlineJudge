/**
 * @description iNOC产品部--完全数计算
 * @author GongchuangSu
 * @since 2016.08.10
 * @explain 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 *          它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。 
 *          给定函数count(int n),用于计算n以内(含n)完全数的个数。计算范围, 0 < n <= 500000
 *          输入：输入一个数字
 *          输出：输出完全数的个数
 *          样例：
 *              输入：1000
 *              输出：3
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		int num = sc.nextInt();
    		int count = 0;
    		List<Integer> list;
    		while(num > 0){
        		list = new ArrayList<>();
        		int i = 1;
        		while( i < num){
        			if(num % i == 0)
        				list.add(i);
        			i++;
        		}
        		int sum = 0;
        		for(Integer k : list){
        			sum += k;
        		}
        		if(sum == num)
        			count++;   
        		num--;
    		}
    		System.out.println(count);
    	}
    	sc.close();
    }     
}