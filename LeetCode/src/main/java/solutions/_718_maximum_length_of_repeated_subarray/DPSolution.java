package solutions._718_maximum_length_of_repeated_subarray;

/**
 * 动态规划求解最大公共子串长度
 * @Description
 *      Given two integer arrays A and B, return the maximum length of an subarray that appears in both arrays.
 * @Example
 *      Input:
 *      A: [1,2,3,2,1]
 *      B: [3,2,1,4,7]
 *      Output: 3
 *      Explanation:
 *      The repeated subarray with maximum length is [3, 2, 1].
 *
 *      Since a common subarray of A and B must start at some A[i] and B[j],
 *      let dp[i][j] be the longest common prefix of A[i:] and B[j:].
 *      Whenever A[i] == B[j], we know dp[i][j] = dp[i+1][j+1] + 1. Also, the answer is max(dp[i][j]) over all i, j.
 * @author GongchuangSu
 * @date 2020.08.25
 */
public class DPSolution {
	
	public int findLength(int[] A, int[] B) {
		if(A == null||B == null) {return 0;}
		int m = A.length;
		int n = B.length;
		int max = 0;
		int[][] dp = new int[m + 1][n + 1];
		for(int i = 0;i <= m;i++){
			for(int j = 0;j <= n;j++){
				if(i == 0 || j == 0){
					dp[i][j] = 0;
				} else{
					if(A[i - 1] == B[j - 1]){
						dp[i][j] = 1 + dp[i - 1][j - 1];
						max = Math.max(max,dp[i][j]);
					}
				}
			}
		}
		return max;
	}

}

/** Complexity analysis
 * Time complexity : O(M*N).
 * Space complexity:O(M*N).
 */
