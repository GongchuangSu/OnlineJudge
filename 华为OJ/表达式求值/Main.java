/**
 * @description 表达式求值
 * @author GongchuangSu
 * @since 2016.08.16
 * @explain 给定一个字符串描述的算术表达式，计算出结果值。
 *          输入字符串长度不超过100，合法的字符包括"+, -, *, /, (, )"，"0-9"，
 *          字符串内容的合法性及表达式语法的合法性由做题者检查。本题目只涉及整型计算。
 *          输入：输入算术表达式
 *          输出：计算出结果值
 *          样例：
 *             输入：400+5
 *             输出：405
 * @知识点 栈
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            List < String > all = new ArrayList < > ();
            int len = str.length();
            for (int i = 0; i < len;) {
                if (str.charAt(i) >= 40 && str.charAt(i) <= 47) {
                    all.add(String.valueOf(str.charAt(i)));
                    i++;
                    continue;
                } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                    if (i == len - 1) {
                        all.add(str.substring(i));
                        break;
                    } else {
                        int j = 0;
                        for (j = i + 1; j < len; j++) {
                            if (str.charAt(j) >= 40 && str.charAt(j) <= 47) { //非数字
                                all.add(str.substring(i, j));
                                all.add(str.substring(j, j + 1));
                                i = j + 1;
                                break;
                            }
                        }
                        if (j == len - 1 && str.charAt(j) >= 48 && str.charAt(j) <= 57) {
                            all.add(str.substring(i, len));
                            break;
                        }
                    }
                }
            }
            //读入完毕，all里面存放所有的元素，包括数字和符号

            //下面开始算法：利用栈，将中缀转换为后缀
            List < String > number = new ArrayList < > ();
            Stack < String > symbol = new Stack < > ();
            int len2 = all.size();
            for (int i = 0; i < len2; i++) {
                String temp = all.get(i);
                if (!temp.equals("(") && !temp.equals(")") && !temp.equals("+") && !temp.equals("-") && !temp.equals("*") && !temp.equals("/")) { //如果是数字,则加入List number
                    number.add(temp);
                } else if (temp.equals("(") || temp.equals("*") || temp.equals("/")) { //如果是开括号，则进入符号栈
                    symbol.push(temp);
                } else if (temp.equals(")")) { //如果是闭括号，则将对应的开括号之前的符号存入数字栈
                    for (int j = symbol.size() - 1; j >= 0; j--) {
                        String ch = symbol.pop();
                        if (!ch.equals("("))
                            number.add(ch);
                        else if (ch.equals("("))
                            break;
                    }
                } else if (temp.equals("+") || temp.equals("-")) {
                    if (symbol.size() == 0 || (symbol.size() >= 1 && symbol.get(symbol.size() - 1).equals("(")))
                        symbol.push(temp);
                    else {
                        for (int j = symbol.size() - 1; j >= 0; j--) {
                            String ch = symbol.get(symbol.size() - 1);
                            if (!ch.equals("("))
                                number.add(symbol.pop());
                            else
                                break;
                        }
                        symbol.push(temp);
                    }
                }
            }
            int len3 = symbol.size();
            for (int i = 0; i < len3; i++)
                number.add(symbol.pop());
            //构造后缀完成

            //求表达式的值
            int len4 = number.size();
            Stack < Integer > newNumber = new Stack < > ();
            for (int i = 0; i < len4; i++) {
                String temp = number.get(i);
                if (!temp.equals("(") && !temp.equals(")") && !temp.equals("+") && !temp.equals("-") && !temp.equals("*") && !temp.equals("/")) //数字的话，直接入栈
                    newNumber.push(Integer.parseInt(temp));
                else { //如果是运算符号，则两个出栈，运算以后再入栈
                    int n1 = newNumber.pop();
                    int n2 = newNumber.pop();
                    int n3 = 0;
                    if (temp.equals("+"))
                        n3 = n2 + n1;
                    else if (temp.equals("-"))
                        n3 = n2 - n1;
                    else if (temp.equals("*"))
                        n3 = n2 * n1;
                    else if (temp.equals("/"))
                        n3 = n2 / n1;
                    newNumber.push(n3);
                }
            }
            System.out.println(newNumber.pop());
        }
        sc.close();
    }
}