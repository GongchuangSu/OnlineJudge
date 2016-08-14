/**
 * @description 汽水瓶
 * @author GongchuangSu
 * @since 2016.08.14
 * @explain 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”
 *          答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时
 *          候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上
 *          有n个空汽水瓶，最多可以换多少瓶汽水喝？
 *          输入：输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），表示小张手上的空汽水瓶数。
 *                n=0表示输入结束，你的程序不应当处理这一行。
 *          输出：对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。
 *          样例：
 *              输入：3
 *                   10
 *                   81
 *                   0
 *              输出：1
 *                   5
 *                   40
 * @知识点 循环
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if(num == 0 || num < 1 || num > 100)
            	break;
            int m = num / 3;
            int n = num % 3;
            int count = m;
            while(m > 0){
            	int temp1 = m;
            	int temp2 = n;
            	m = (temp1 + temp2) / 3;
            	n = (temp1 + temp2) % 3;
            	count += m;
            }
            if(m == 0 && n == 2)
            	count++;
            System.out.println(count);
        }
        sc.close();
    }
}