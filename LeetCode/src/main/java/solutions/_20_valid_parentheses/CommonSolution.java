package solutions._20_valid_parentheses;

import java.util.HashMap;
import java.util.Map;
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
 * @date 2019.11.15
 */
public class CommonSolution {

    public boolean isValid(String s) {
        if(null == s || "".equals(s)){
            return true;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> st = new Stack<>();
        char[] cs = s.toCharArray();
        for(int i =0; i < cs.length; i++){
            if(st.size() == 0 || map.get(st.peek()) == null || map.get(st.peek()) != cs[i]){
                st.push(cs[i]);
            }else{
                st.pop();
            }
        }
        return st.size() == 0;
    }

}

/** Complexity analysis
 * Time complexity : O(n).
 * Space complexity:O(n).
 */
