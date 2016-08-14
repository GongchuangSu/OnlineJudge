/**
 * @description 合法IP
 * @author GongchuangSu
 * @since 2016.08.14
 * @explain 现在IPV4下用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，
 *          表示成一个无符号整数（因此不需要用正号出现），如10.137.17.1，是我们非常熟悉的IP地址，一个IP地址
 *          串中没有空格出现（因为要表示成一个32数字）。现在需要你用程序来判断IP是否合法。
 *          输入：输入一个ip地址
 *          输出：返回判断的结果YES or NO
 *          样例：
 *              输入：10.138.15.1
 *              输出：YES
 * @知识点 字符串
 */
import java.util.*;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {  
        	String[] strs = sc.nextLine().split("\\.");
        	if(strs == null || strs.length != 4){
        		System.out.println("NO");
        		break;
        	}
        	int i;
        	for(i = 0; i < strs.length; i++){
        		char[] cs = strs[i].toCharArray();
        		int j;
        		for(j = 0; j < cs.length; j++){
        			if(cs[j] < '0' || cs[j] > '9')
        				break;
        		}
        		// 如果有非数字字符，则输出"NO"
        		if(j != cs.length){
        			System.out.println("NO");
        			break;
        		}else{
        			int num = Integer.valueOf(strs[i]);
        			// 如果数字范围不在[0,255]，则输出"NO"
        			if(num < 0 || num > 255){
        				System.out.println("NO");
            			break;
        			}
        		}
        	}
        	if(i == strs.length){
    			System.out.println("YES");
        	}
        }
        sc.close();
    }
}