package solutions._989_add_to_array_form_of_integer;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @Description
 *      For a non-negative integer X, the array-form of X is an array of its digits in left to right order.
 *      For example, if X = 1231, then the array form is [1,2,3,1].
 *
 *      Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.
 * @Example
 *      1.  Input: A = [1,2,0,0], K = 34
 *          Output: [1,2,3,4]
 *          Explanation: 1200 + 34 = 1234
 *
 *      2.  Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
 *          Output: [1,0,0,0,0,0,0,0,0,0,0]
 *          Explanation: 9999999999 + 1 = 10000000000
 * @author GongchuangSu
 * @date 2020.03.22
 */
public class CommonSolution {
	
	public List<Integer> addToArrayForm(int[] A, int K) {
		List<Integer> res = new LinkedList<>();
		for (int i = A.length - 1; i >= 0; --i) {
			res.add(0, (A[i] + K) % 10);
			K = (A[i] + K) / 10;
		}
		while (K > 0) {
			res.add(0, K % 10);
			K /= 10;
		}
		return res;
	}

}
