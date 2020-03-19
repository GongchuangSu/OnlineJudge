package solutions._67_add_binary;

/**
 *
 * @Description
 *      Given two binary strings, return their sum (also a binary string).
 *      The input strings are both non-empty and contains only characters 1 or 0.
 * @Example
 *      1.  Input: a = "11", b = "1"
 *          Output: "100"
 *
 *      2.  Input: a = "1010", b = "1011"
 *          Output: "10101"
 * @author GongchuangSu
 * @date 2020.03.19
 */
public class CommonSolution {
	
	public String addBinary(String a, String b) {
		StringBuilder sum = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		
		while(i >= 0 || j >= 0 || carry > 0){
			int digitA = i < 0 ? 0 : a.charAt(i--) - '0';
			int digitB = j < 0 ? 0 : b.charAt(j--) - '0';
			sum.insert(0, (digitA + digitB + carry) % 2);
			carry = (digitA + digitB + carry) / 2;
		}
		
		return sum.toString();
	}

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(n).
 */
