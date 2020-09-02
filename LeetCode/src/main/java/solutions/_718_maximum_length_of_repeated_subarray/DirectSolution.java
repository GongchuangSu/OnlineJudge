package solutions._718_maximum_length_of_repeated_subarray;

/**
 * 暴力求解最大公共子串长度
 * @Description
 *      Given two integer arrays A and B, return the maximum length of an subarray that appears in both arrays.
 * @Example
 *      Input:
 *      A: [1,2,3,2,1]
 *      B: [3,2,1,4,7]
 *      Output: 3
 *      Explanation:
 *      The repeated subarray with maximum length is [3, 2, 1].
 * @author GongchuangSu
 * @date 2020.08.25
 */
public class DirectSolution {
	
	public int findLength(int[] A, int[] B) {
		if(A == null || B == null){
			return 0;
		}
		int max = 0;
		int count;
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < B.length; j++){
				count = 0;
				int n = j;
				int m = i;
				while(m < A.length && n < B.length && A[m] == B[n]){
					m++;
					n++;
					count++;
				}
				max = count > max ? count : max;
			}
		}
		return max;
	}
}

/** Complexity analysis
 * Time complexity : O(M*N).
 * Space complexity:O(M^N).
 */
