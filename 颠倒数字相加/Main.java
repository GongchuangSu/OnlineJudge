/**
 * @description 颠倒数字相加
 * @author GongchuangSu
 * @since 2016.03.30
 * @explain 编写一个程序，将输入的两个数字进行反转，然后进行相加，返回它们的和
 * 			输入：两个小于1000的整数
 *          输出：翻转后的和
 *          提示：当输入数字不在0-1000范围内时，返回-1
 *          样例：输入8 210 输出 20
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(numberReverseSum(num1, num2));
    }

    /**
     * 功能：颠倒数字，并返回其和
     */
    private static int numberReverseSum(int num1, int num2) {
        if (num1 > 0 && num1 < 1000 && num2 > 0 && num2 < 1000) {
            char[] c1 = String.valueOf(num1).toCharArray(); // 将输入的数字转换成char型数组
            char[] c2 = String.valueOf(num2).toCharArray(); // 将输入的数字转换成char型数组
            num1 = reverse(c1); // 颠倒数字
            num2 = reverse(c2); // 颠倒数字
            return num1 + num2;
        }
        return -1;
    }

    /**
     * 功能：字符串反转，并返回int型值
     */
    private static int reverse(char[] c) {
        int i = 0, j;
        j = c.length - 1;
        char temp;
        while (i < j) {
            temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return Integer.parseInt(String.valueOf(c)); // char型转int型
    }
}