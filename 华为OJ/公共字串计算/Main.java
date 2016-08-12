/**
 * @description 公共字串计算
 * @author GongchuangSu
 * @since 2016.08.12
 * @explain 计算两个字符串的最大公共字串的长度，字符不区分大小写
 *          输入：输入两个字符串
 *          输出：输出一个整数
 *          样例：
 *              输入：asdfas werasdfaswer
 *              输出：6
 * @知识点 字符串
 */
import java.util.*;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        while(sc.hasNext()){
        	String[] strs = sc.nextLine().split(" ");
        	char[] c1 = strs[0].toLowerCase().toCharArray();
        	char[] c2 = strs[1].toLowerCase().toCharArray();
        	int m = c1.length;
        	int n = c2.length;
        	int count = 0;
        	for(int i = 0; i < m; i++){
        		int p = i;
        		int q = 0;
            	while( p < m && q < n){
            		int temp = 0;
            		while( p < m && q < n && c1[p] == c2[q]){
            			temp++;
            			p++;
            			q++;
            		}
            		count = temp > count ? temp : count;
            		q++;
            	}
        	}
        	System.out.println(count);
        }        
        sc.close();
    }
}