/**
 * @description 找出字符串中第一个只出现一次的字符
 * @author GongchuangSu
 * @since 2016.08.14
 * @explain 找出字符串中第一个只出现一次的字符
 *          输入：输入一串字符
 *          输出：输出一个字符
 *          样例：
 *             输入：asdfasdfo
 *             输出：o
 * @知识点 字符串
 */
import java.util.Scanner;  
  
public class Main {   
  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        while(sc.hasNext()){
        	String str = sc.nextLine();
        	char[] cs = str.toCharArray();
        	for(int i = 0; i < cs.length; i++){
        		if(str.indexOf(cs[i]) == str.lastIndexOf(cs[i])){
        			System.out.println(cs[i]);
        			break;
        		}
        	}
        }
        sc.close();  
    }  
}