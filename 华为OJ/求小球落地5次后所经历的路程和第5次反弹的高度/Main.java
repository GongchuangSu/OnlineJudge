/**
 * @description 求小球落地5次后所经历的路程和第5次反弹的高度
 * @author GongchuangSu
 * @since 2016.08.13
 * @explain 假设一个球从任意高度自由落下，每次落地后反跳回原高度的一半; 再落下, 
 *          求它在第5次落地时，共经历多少米?第5次反弹多高？
 *          输入：输入起始高度，int型
 *          输出：分别输出第5次落地时，共经过多少米及第5次反弹多高
 *          样例：
 *              输入：1
 *              输出：2.875
 *                    0.03125
 * @知识点 循环、查找
 */
import java.util.*;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	double high = sc.nextDouble();
        	double fifth = 0;
        	double sum = high;
	        for(int i = 1; i < 5; i++){
	        	double denom = Math.pow(2, i);
	        	sum += (high * 2) / denom;
	        	fifth = high / (denom * 2);
	        }	
	        System.out.println(sum);
	        System.out.println(fifth);
        }
        sc.close();
    }
}