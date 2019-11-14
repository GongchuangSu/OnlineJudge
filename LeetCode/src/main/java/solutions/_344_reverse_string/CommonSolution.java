package solutions._344_reverse_string;

/**
 *
 * @Description
 *      Write a function that reverses a string. The input string is given as an array of characters char[].
 *      Do not allocate extra space for another array, you must do this by modifying the input array in-place
 *      with O(1) extra memory.
 * @Example
 *      1. Input: ["h","e","l","l","o"]
 *         Output: ["o","l","l","e","h"]
 *
 *      2. Input: ["H","a","n","n","a","h"]
 *         Output: ["h","a","n","n","a","H"]
 * @author GongchuangSu
 * @date 2019.11.14
 */
public class CommonSolution {

    public void reverseString(char[] s) {
        int len = s.length;
        for(int i =0; i < len/2; i++){
            char temp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = temp;
        }
    }

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(n).
 */
