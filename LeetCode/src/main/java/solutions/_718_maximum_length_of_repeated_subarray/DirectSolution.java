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
		if(A == null||B == null) {return 0;}
		int m = A.length;
		int n = B.length;
		int count = 0;
		for(int i = 0; i < m; i++){
			int p = i;
			int q = 0;
			while(p < m && q < n){
				int temp = 0;
				while(p < m && q < n && A[p] == B[q]){
					p++;
					q++;
					temp++;
				}
				count = count > temp ? count : temp;
				q++;
			}
		}
		return count;
	}
}

/** Complexity analysis
 * Time complexity : O(M*N).
 * Space complexity:O(M^N).
 */
