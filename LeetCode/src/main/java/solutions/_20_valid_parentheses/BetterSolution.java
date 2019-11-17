package solutions._20_valid_parentheses;


import java.util.Stack;

/**
 *
 * @Description
 *      Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 *          determine if the input string is valid.
 *      An input string is valid if:
 *          Open brackets must be closed by the same type of brackets.
 *          Open brackets must be closed in the correct order.
 *      Note that an empty string is also considered valid.
 *
 * @Example
 *      1. Input: "()"      Output: true
 *      2. Input: "()[]{}"  Output: true
 *      3. Input: "(]"      Output: false
 *      4. Input: "([)]"    Output: false
 *      5. Input: "{[]}"    Output: true
 * @author GongchuangSu
 * @date 2019.11.18
 */
public class BetterSolution {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(')');
            }else if(c == '['){
                st.push(']');
            }else if(c == '{'){
                st.push('}');
            }else if(st.isEmpty() || st.pop() != c){
                return false;
            }
        }
        return st.size() == 0;
    }

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(n).
 */
