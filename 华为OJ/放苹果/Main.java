/**
 * @description 放苹果
 * @author GongchuangSu
 * @since 2016.08.10
 * @explain 把M个同样的苹果放在N个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？
 *         （用K表示）5，1，1和1，5，1 是同一种分法。
 *          输入：输入两个int整数
 *          输出：输出结果，int型
 *          样例：
 *              输入：7 3
 *              输出：8
 * @知识点      字符串、递归
 * @解题思路  递归思想：find(m,n) = find(m,n - 1) + find(m - n,n)
 */
import java.util.*;

public class Main {
	
	public static int find(int m, int n){
		if(m == 1 || m == 0 || n == 1) // 当只有一个或没有苹果或一个盘子时，只有一种情况
			return 1;
		if(m < n)
			return find(m, m); // 当苹果数m小于盘子数n，其相当于m个苹果放置m个盘子中
		else			
			return find(m, n - 1) + find(m - n, n); // 分解为两种情形：1.有一个盘子为空 2.没有盘子为空
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		int m = sc.nextInt();
    		int n = sc.nextInt();
    		System.out.println(find(m, n));
    	}
    	sc.close();
    }     
}