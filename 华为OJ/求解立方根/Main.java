/**
 * @description 求解立方根
 * @author GongchuangSu
 * @since 2016.08.19
 * @explain 计算一个数字的立方根，不使用库函数
 *          输入：待求解参数 double类型
 *          输出：输入参数的立方根 也是double类型
 *          样例：
 *             输入：216
 *             输出：6.0
 * @知识点 循环
 */

import java.text.DecimalFormat;
import java.util.*; 

public class Main { 	
	
	/**
	 * 功能：求解立方根
	 */
	public static double getCubeRoot(double d){
		double j = 0.0001;
		for(double i = 0; i < d; i = i + j){
			if((i*i*i - d > 0 && i*i*i - d < 0.01) || (i*i*i - d < 0 && d - i*i*i < 0.01))
				return i;
		}
		return 0;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double d = sc.nextDouble();
			DecimalFormat df = new DecimalFormat("0.0");			
			System.out.println(df.format(getCubeRoot(d)));
		}
		sc.close();
    }
}