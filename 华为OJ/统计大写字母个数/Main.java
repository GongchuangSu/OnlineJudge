/**
 * @description 统计大写字母个数
 * @author GongchuangSu
 * @since 2016.08.11
 * @explain 找出给定字符串中大写字符(即'A'-'Z')的个数
 *          输入：输入一个String数据
 *          输出：输出string中大写字母的个数
 *          样例：
 *              输入：add123#$%#%#O
 *              输出：1
 * @知识点    字符串
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            if(str == null || str.length() == 0){
            	System.out.println(0);
            }else{
                char[] cs = str.toCharArray();
                int length = cs.length;
                int count = 0;
                for(int i = 0; i < length; i++){
                	if(cs[i] >= 'A' && cs[i] <= 'Z')
                		count++;
                }
                System.out.println(count);  	
            }         		
        }
        sc.close();
    }
}