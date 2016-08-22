/**
 * @description 查找两个字符串a,b中的最长公共子串
 * @author GongchuangSu
 * @since 2016.08.22
 * @explain 查找两个字符串a,b中的最长公共子串。若有多个，输出在较短串中最先出现的那个。 
 *          输入：输入两个字符串
 *          输出：返回重复出现的字符
 *          样例：
 *             输入：abcdefghijklmnop
 *             输出：abcsafjklmnopqrstuvw
 * @知识点 字符串
 */

import java.util.*;

public class Main {
	
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		char[] c1 = sc.nextLine().toCharArray();
    		char[] c2 = sc.nextLine().toCharArray();
    		int temp = 0;
    		StringBuffer sb = new StringBuffer();
    		for(int i = 0; i < c1.length; i++){
    			int k = i;
    			for(int j = 0; j < c2.length; j++){
    				int count = 0;
    				StringBuffer sb2 = new StringBuffer();
    				while(k < c1.length && j < c2.length && c1[k] == c2[j]){
    					sb2.append(c1[k]);
    					count++;
    					k++;
    					j++;
    				}
    				k = i;
    				if(count >= temp){
    					temp = count;
    					sb = sb2;
    				}   					
    			}
    		}
    		System.out.println(sb.toString());
    	}
    	sc.close();
    }
}