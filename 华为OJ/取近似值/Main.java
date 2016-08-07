/**
 * @description 取近似值
 * @author GongchuangSu
 * @since 2016.08.07
 * @explain 写出一个程序，接受一个浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。 
 * 			输入：输入一个浮点数值
 *          输出：输出该数值的近似整数值
 *          样例：
 *              输入：5.5
 *              输出 ：6
 * @解题思路：利用浮点型转整数型，小数部分会丢失特性
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        int i = (int)d;
        System.out.println((d - i) >= 0.5 ? i+1 : i);
    }
}