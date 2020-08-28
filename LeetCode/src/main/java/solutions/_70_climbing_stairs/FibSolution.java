package solutions._70_climbing_stairs;

/**
 * 斐波拉契求解爬楼梯
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
 *      Fib(n)=Fib(n−1)+Fib(n−2)
 * @author GongchuangSu
 * @date 2020.08.28
 */
public class FibSolution {
	
	public int climbStairs(int n) {
		if(n == 0 || n == 1 || n == 2){
			return n;
		}
		int first = 1;
		int second = 2;
		for(int i = 3; i <= n; i++){
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
	}

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(1).
 */
