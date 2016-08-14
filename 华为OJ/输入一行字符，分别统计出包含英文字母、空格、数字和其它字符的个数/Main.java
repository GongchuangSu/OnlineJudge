/**
 * @description 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数
 * @author GongchuangSu
 * @since 2016.08.14
 * @explain 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数
 *          输入：输入一行字符串，可以有空格
 *          输出：统计其英文字符，空格字符，数字字符，其他字符的个数
 *          样例：
 *              输入：1qazxsw23 edcvfr45tgbn hy67uj m,ki89ol.\\/;p0-=\\][
 *              输出：26
 *                    3
 *                    10
 *                    12
 * @知识点 字符串
 */
import java.util.*;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {  
        	char[] cs = sc.nextLine().toCharArray();
        	int num1 = 0; // 英文字符个数
        	int num2 = 0; // 空格字符个数
        	int num3 = 0; // 数字字符个数
        	int num4 = 0; // 其它字符个数
        	for(int i = 0; i < cs.length; i++){
        		if((cs[i] >= 'a' && cs[i] <= 'z') || (cs[i] >= 'A' && cs[i] <= 'Z'))
        			num1++;
        		else if(cs[i] == ' ')
        			num2++;
        		else if(cs[i] >= '0' && cs[i] <= '9')
        			num3++;
        		else 
					num4++;			
        	}
        	System.out.println(num1);
        	System.out.println(num2);
        	System.out.println(num3);
        	System.out.println(num4);
        }
        sc.close();
    }
}