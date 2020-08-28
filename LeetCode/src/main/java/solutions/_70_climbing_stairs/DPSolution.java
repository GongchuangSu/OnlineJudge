package solutions._70_climbing_stairs;

/**
 * 动态规划求解爬楼梯问题
 * @Description
 *      You are climbing a stair case. It takes n steps to reach to the top.
 *      Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * @Example
 *  Example 1:
 *      Input: 2
 *      Output: 2
 *      Explanation: There are two ways to climb to the top.
 *      1. 1 step + 1 step
 *      2. 2 steps
 *
 *  Example 2:
 *      Input: 3
 *      Output: 3
 *      Explanation: There are three ways to climb to the top.
 *      1. 1 step + 1 step + 1 step
 *      2. 1 step + 2 steps
 *      3. 2 steps + 1 step
 * @Solution
 *      Let dp[i] denotes the number of ways to reach on i^th step
 *      dp[n] = dp[n-1] + dp[n-2]
 * @author GongchuangSu
 * @date 2020.08.28
 */
public class DPSolution {
	
	public int climbStairs(int n) {
		if(n == 0 || n == 1 || n == 2){
			return n;
		}
		int[] mem = new int[n];
		mem[0] = 1;
		mem[1] = 2;
		for(int i = 2; i < n; i++){
			mem[i] = mem[i-1] + mem[i-2];
		}
		return mem[n-1];
	}

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(n).
 */
