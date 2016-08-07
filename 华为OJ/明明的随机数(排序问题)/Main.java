/**
 * @description 明明的随机数
 * @author GongchuangSu
 * @since 2016.08.07
 * @explain 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 *          对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，
 *          按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
 * 			输入：输入多行，先输入随机整数的个数，再输入相应个数的整数
 *          输出：返回多行，处理后的结果
 *          样例：
 *              输入：3
 *                    10
 *                    8
 *                    12
 *              输出 ：8
 *                    10
 *                    12
 * @解决方案 方案一：直接使用TreeSet
 *           方案二：先通过HashSet存储(数字不重复)，再转换成List，调用Collections.sort()进行排序
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<Integer>();
            for(int i = 0 ; i < num ;i++){
                int curr = sc.nextInt();
                set.add(curr);
            }
            for(Integer i : set){
                System.out.println(i);
            }
        }
    }
}