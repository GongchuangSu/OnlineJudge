/**
 * @description 统计每个月兔子的总数
 * @author GongchuangSu
 * @since 2016.08.10
 * @explain 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 *          假如兔子都不死，问第N个月有多少对兔子
 *          输入：输入int型表示month
 *          输出：输出兔子总数int型
 *          样例：
 *              输入：9
 *              输出：34
 * @知识点      字符串、递归
 * @解题思路  斐波那契数列：f(m) = f(m-1) + f(m-2)
 */
import java.util.*;

public class Main {
	
	public static int get(int month){
		if(month <= 0)
			return 0;
		if(month == 1 || month == 2) // 第一个月和第二月都是一对兔子
			return 1;
		else
			return get(month - 1) + get(month - 2);
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		int month = sc.nextInt();
    		System.out.println(get(month));    		
    	}
    	sc.close();
    }     
}