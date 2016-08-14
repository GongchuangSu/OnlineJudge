/**
 * @description 无线OSS－高精度整数加法
 * @author GongchuangSu
 * @since 2016.08.14
 * @explain 在计算机中，由于处理器位宽限制，只能处理有限精度的十进制整数加减法，比如在32位宽处理器计算机中，
 *          参与运算的操作数和结果必须在-231~231-1之间。如果需要进行更大范围的十进制整数加法，需要使用特殊
 *          的方式实现，比如使用字符串保存操作数和结果，采取逐位运算的方式。如下：
 *                     9876543210 + 1234567890 = ?
 *          让字符串 num1="9876543210"，字符串 num2="1234567890"，结果保存在字符串 result = "11111111100"。
 *                    -9876543210 + (-1234567890) = ?
 *          让字符串 num1="-9876543210"，字符串 num2="-1234567890"，结果保存在字符串 result = "-11111111100"。
 *          输入：输入两个字符串
 *          输出：输出给求和后的结果
 *          样例：
 *              输入：9876543210
 *                    1234567890
 *              输出：11111111100
 * @知识点 字符串
 */
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	String a=sc.next();
            String b=sc.next();
            BigInteger c=new BigInteger(a);
            BigInteger d=new BigInteger(b);
            System.out.println(c.add(d));	
        }
        sc.close();
    }
}