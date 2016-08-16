/**
 * @description 超长正整数相加
 * @author GongchuangSu
 * @since 2016.08.16
 * @explain 请设计一个算法完成两个超长正整数的加法。
 *          输入：输入两个字符串数字
 *          输出：输出相加后的结果，string型
 *          样例：
 *             输入：99999999999999999999999999999999999999999999999999
 *                   1
 *             输出：100000000000000000000000000000000000000000000000000
 * @知识点 字符串
 */
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);  
        String num1 = scan.nextLine();  
        String num2 = scan.nextLine();  
        String result = AddLongInteger(num1, num2);  
        System.out.println(result);  
    }  
      
    public static String AddLongInteger(String num1,String num2){  
        String result = "";  
        String longStr = "";  
        String shortStr = "";  
          
        if(num1.length() > num2.length()){  
            longStr = num1;shortStr = num2;  
        }else {  
            longStr = num2;shortStr = num1;  
        }  
        int flag = 0;//做为进位标志  
        int n = 0;  
        int j = shortStr.length() - 1 ;  
        int i = longStr.length() -1;  
        while(i >= 0){  
            if(j >= 0){  
                for(; j >= 0; j --){  
                    n = Integer.parseInt(String.valueOf(longStr.charAt(i))) + Integer.parseInt(String.valueOf(shortStr.charAt(j)));  
                    result = (n + flag) % 10 + result;  
                    if(n + flag >= 10){  
                        flag = 1;  
                    }else{  
                        flag = 0;  
                    }  
                    i --;  
                }  
            }  
              
            else if(j < 0 && i >= 0 ){  
                n=Integer.parseInt(String.valueOf(longStr.charAt(i))) ;  
                result = (n + flag) % 10 + result;  
                if(n + flag >= 10){  
                    flag = 1;  
                }else{  
                    flag = 0;  
                }  
                 i --;  
            }  
        }  
        if(flag != 0 ){  
            result = flag + result;  
        }  
          
        return result;  
    }  
      
    /** 
     * 不能计算超出范围的数 
     * @param num1 
     * @param num2 
     * @return 
     */  
    public static String AddLongInteger1(String num1,String num2){  
        String result = "";  
        Integer n1 = Integer.parseInt(num1);  
        Integer n2 = Integer.parseInt(num2);  
        result = String.valueOf(n1 + n2);  
        return result;  
    }  
  
}  