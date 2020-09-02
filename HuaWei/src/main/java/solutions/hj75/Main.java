package solutions.hj75;

import java.util.Scanner;

/**
 * [HJ75]公共字串计算
 * @Description
 *  计算两个字符串的最大公共字串的长度，字符不区分大小写
 *  输入描述:
 *      输入两个字符串
 *  输出描述:
 *      输出一个整数
 * @Example
 *  输入:
 *      bacefaebcdfabfaadebdaacabbdabcfffbdcebaabecefddfaceeebaeabebbad
 *      dedcecfbbbecaffedcedbadadbbfaafcafdd
 *  输出:
 *      4
 * @author sugongchuang
 * @date 2020.09.02
 */
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] c1 = sc.nextLine().toLowerCase().toCharArray();
		char[] c2 = sc.nextLine().toLowerCase().toCharArray();
		System.out.println(directSolution(c1, c2));
//		System.out.println(dpSolution(c1, c2));
	}
	
	/**
	 * 暴力求解法
	 * @param c1
	 * @param c2
	 */
	public static int directSolution(char[] c1, char[] c2){
		if(c1 == null || c2 == null){
			return 0;
		}
		int max = 0;
		int count;
		for(int i = 0; i < c1.length; i++){
			for(int j = 0; j < c2.length; j++){
				count = 0;
				int n = j;
				int m = i;
				while(m < c1.length && n < c2.length && c1[m] == c2[n]){
					m++;
					n++;
					count++;
				}
				max = count > max ? count : max;
			}
		}
		return max;
	}
	
	/**
	 * 动态规划求解法
	 * @param c1
	 * @param c2
	 */
	public static int dpSolution(char[] c1, char[] c2){
		if(c1 == null||c2 == null) {return 0;}
		int m = c1.length;
		int n = c2.length;
		int max = 0;
		int[][] dp = new int[m + 1][n + 1];
		for(int i = 0;i <= m;i++){
			for(int j = 0;j <= n;j++){
				if(i == 0 || j == 0){
					dp[i][j] = 0;
				} else{
					if(c1[i - 1] == c2[j - 1]){
						dp[i][j] = 1 + dp[i - 1][j - 1];
						max = Math.max(max,dp[i][j]);
					}
				}
			}
		}
		return max;
	}
}
