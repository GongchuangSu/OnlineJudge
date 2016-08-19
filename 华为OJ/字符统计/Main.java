/**
 * @description 字符统计
 * @author GongchuangSu
 * @since 2016.08.19
 * @explain 输入一个字符串，对字符中的各个英文字符，数字，空格进行统计（可反复调用）。
 *          按照统计个数由多到少输出统计结果，如果统计的个数相同，则按照ASII码由小到大排序输出
 *          输入：输入一串字符
 *          输出：输出字符串
 *          样例：
 *             输入：aadddccddc
 *             输出：dca
 * @知识点 字符串、排序
 */

import java.util.*;

public class Main {
	
	public static void getResult(String s){
		char[] cs = s.toCharArray();
		int[] m = new int[256];
		for(int i = 0; i < cs.length; i++){
			m[cs[i]]++;
		}
		int max = Integer.MIN_VALUE;
		for(int j = 0; j < 256; j++){
			if(max < m[j])
				max = m[j];
		}
		while(max != 0){
			for(int k = 0; k < 256; k++){
				if(m[k] == max)
					System.out.print((char)k);
			}
			max--;
		}
		System.out.println();
	}
	
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            getResult(s);
        }
        scanner.close();
    }
}