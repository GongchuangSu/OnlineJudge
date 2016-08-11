/**
 * @description 密码强度等级
 * @author GongchuangSu
 * @since 2016.08.11
 * @explain 请参考同目录下的README文件
 *          输入：输入一个string的密码
 *          输出：输出密码等级
 *          样例：
 *              输入：38$@NoNoNo
 *              输出：VERY_SECURE
 * @知识点    字符串、查找
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            char[] cs = str.toCharArray();
            int length = cs.length;
            int score = 0;
            // num[0]：统计小写字母个数	num[1]：统计大写字母个数
            // num[2]：统计数字个数	    num[3]：统计符号个数
            int[] num = new int[4];
            for(int i = 0; i < length; i++){
            	char c = cs[i];
            	if(c >= 'a' && c <= 'z')
            		num[0]++;
            	if(c >= 'A' && c <= 'Z')
            		num[1]++;
            	if(c >= '0' && c <= '9')
            		num[2]++;
            	if((c >= '!' && c <= '/') || (c >= ':' && c <= '@') 
            			|| (c >= '[' && c <= '`') || (c >= '{' && c <= '~'))
            		num[3]++;
            }
            // 统计分数
            // 1.密码长度
            if(length <= 4)                           // 小于等于4个字符(5分)
            	score += 5;
            else if(length >= 5 && length <= 7)       // 5到7个字符(10分)
            	score += 10;
            else                                      // 大于等于8个字符(25分)
            	score += 25; 
            // 2.字母
            if(num[0] != 0 && num[1] != 0)            // 大小写混合字母(20分)
            	score += 20;
            else if( (num[0] != 0 && num[1] == 0)
            		 || (num[0] == 0 && num[1] != 0)) // 全是小(大)写字母(10分)
            	score += 10;
            // 3.数字
            if(num[2] == 1)      // 1个数字(10分)                      
            	score += 10;
            else if(num[2] > 1)  // 大于1个数字(20分)
            	score += 20;
            // 4.符号
            if(num[3] == 1)      // 1个字符(10分)                      
            	score += 10;
            else if(num[3] > 1)  // 大于1个字符(25分)
            	score += 25;
            // 5.奖励
            if(num[0] > 0 && num[1] > 0 && num[2] > 0 && num[3] > 0)   // 大小写字母、数字和符号(5分)
            	score += 5;
            else if((num[0] > 0 || num[1] > 0) && num[2] > 0 && num[3] > 0) // 字母、数字和符号(3分)
            	score += 3;
            else if((num[0] > 0 || num[1] > 0) && num[2] > 0)               // 字母和数字(2分)
            	score += 2;                        
            // 输出等级
            if(score >= 90)
            	System.out.println("VERY_SECURE");
            else if(score >= 80)
            	System.out.println("SECURE");
            else if(score >= 70)
            	System.out.println("VERY_STRONG");
            else if(score >= 60)
            	System.out.println("STRONG");
            else if(score >= 50)
            	System.out.println("AVERAGE");
            else if(score >= 25)
            	System.out.println("WEAK");
            else 
            	System.out.println("VERY_WEAK");			
        }
        sc.close();
    }
}