/**
 * @description 质数因子
 * @author GongchuangSu
 * @since 2016.08.07
 * @explain 输入一个正整数，按照从小到大的顺序输出它的所有质数的因子
 * 			输入：输入一个long型整数
 *          输出：按照从小到大的顺序输出它的所有质数的因子，以空格隔开
 *          样例：
 *              输入：180
 *              输出 ：2 2 3 3 5
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	StringBuilder str = new StringBuilder();
        	long l = sc.nextLong();
            if(l <= 1)
                break;
            // 核心代码
            while(l != 1){
                for(int i = 2;i <= l;i++){
                    if(l % i == 0){
                        str.append(i + " ");
                        l = l / i;
                        break;
                    }
                }          
            }
            System.out.println(str);
        }        
    }
}