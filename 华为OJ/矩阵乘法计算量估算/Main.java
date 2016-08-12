/**
 * @description 矩阵乘法计算量估算
 * @author GongchuangSu
 * @since 2016.08.12
 * @explain 矩阵乘法的运算量与矩阵乘法的顺序强相关。
 *          例如：A是一个50×10的矩阵，B是10×20的矩阵，C是20×5的矩阵
 *          计算A*B*C有两种顺序：（（AB）C）或者（A（BC）），前者需要计算15000次乘法，后者只需要3500次。
 *          输入：输入多行，先输入要计算乘法的矩阵个数n，每个矩阵的行数，列数，总共2n的数，最后输入要计算的法则
 *          输出：输出需要进行的乘法次数
 *          样例：
 *              输入：3
 *                   50 10
 *                   10 20
 *                   20 5
 *                   (A(BC))
 *              输出：3500
 * @知识点 字符串
 */
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int[] arr = new int[num * 2];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            String rule = scanner.next();
            System.out.println(estimate(arr, rule));
        }
        scanner.close();
    }

    /**
     * 功能：按照法则计算乘法的计算量
     * @param arr  矩阵的大小
     * @param rule 计算法则
     * @return 执行乘法的次数
     */
    private static int estimate(int[] arr, String rule) {
        Deque<Integer> stack = new LinkedList<>();
        int idxArr = 0;
        int idx = 0;
        int result = 0;
        while (idx < rule.length()) {
            char c = rule.charAt(idx);

            // c不是括号
            if (c != '(' && c != ')') {
                // 如果是第一个字符
                if (idx == 0) {
                    stack.addLast(arr[idxArr]);
                    stack.addLast(arr[idxArr + 1]);

                }
                // 不是第一个字符
                else {
                    // 取前一个字符
                    char prev = rule.charAt(idx - 1);
                    // 如果不是括号就要进行计算
                    if (prev != '(' && prev != ')') {
                        // 第一个矩阵的行数和列数
                        int col = stack.removeLast();
                        int row = stack.removeLast();
                        int col2 = arr[idxArr + 1];
                        result += row * col * col2;
                        
                        stack.add(row);
                        stack.add(col2);
                    }
                    // 如果是括号就要添加到栈中
                    else {
                        stack.addLast(arr[idxArr]);
                        stack.addLast(arr[idxArr + 1]);
                    }
                    // 移动到下一个矩阵
                    idxArr += 2;
                }
            }
            // 处理下一个字符
            idx++;
        }

        // 最后stack中只会剩下一个矩阵，只有行和列
        // 要从后向前计算
        while (stack.size() > 2) {
            int col2 = stack.removeLast();
            int row2 = stack.removeLast();
            int col1 = stack.removeLast();
            int row1 = stack.removeLast();
            stack.addLast(row1);
            stack.addLast(col2);
            result += row1 * col1 * col2;
        }

        return result;
    }

}