/**
 * @description 201301 JAVA 题目2-3级
 * @author GongchuangSu
 * @since 2016.08.10
 * @explain 请编写一个函数（允许增加子函数），计算n x m的棋盘格子（n为横向的格子数，m为竖向的格子数）
 *          沿着各自边缘线从左上角走到右下角，总共有多少种走法，要求不能走回头路，即：只能往右和往下
 *          走，不能往左和往上走。
 *          输入：输入两个正整数
 *          输出：返回结果
 *          样例：
 *              输入：2
 *                    2
 *              输出：6
 * @知识点   字符串、递归、排列组合
 * @解题思路 1.递归思想：find(m,n) = find(m-1,n) + find(m,n-1)
 *           2.排列组合：(m+n)!/(m!n!)
 */
import java.util.*;

public class Main {
	
	public static int find(int m, int n){
		if(m == 0 || n == 0)
			return 1;
		else
			return find(m - 1, n) + find(m, n - 1); 
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