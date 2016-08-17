/**
 * @description 合唱队
 * @author GongchuangSu
 * @since 2016.08.17
 * @explain 计算最少出列多少位同学，使得剩下的同学排成合唱队形
 *          说明：N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。 
 *               合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，
 *               T2，…，TK，   则他们的身高满足存在i（1<=i<=K）使得Ti<T2<......<Ti-1<Ti>Ti+1>......>TK。 
 *               你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。 
 *          输入：整数N
 *          输出：最少需要几位同学出列
 *          样例：
 *             输入：8
 *                  186 186 150 200 160 130 197 200
 *             输出：4
 * @知识点 循环、动态规划
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(countChorus(arr));
        }
        scanner.close();
    }

    /**
     * 功能：求最长递增子序列
     */
    private static int countChorus(int[] arr) {
    	int max = 0;
    	int[] arrLeft = getRiseLongestSequenceLeftToRight(arr);
    	int[] arrRight = getRiseLongestSequenceRightToLeft(arr);
    	for(int i = 0; i < arr.length - 1; i++){
    		if(max < arrLeft[i] + arrRight[i]){
    			max = arrLeft[i] + arrRight[i] - 1;
    		}
    	}
    	return arr.length - max;
    }

    /**
     * 功能：从左到右，求到某点的最长递增子序列
     */
    private static int[] getRiseLongestSequenceLeftToRight(int[] arr) { 
    	int[] arrLeft = new int[arr.length];
    	for(int i = 0; i < arr.length; i++){
    		arrLeft[i] = 1;
    		for(int j = 0; j < i; j++){
    			if(arr[i] > arr[j] && arrLeft[i] <= arrLeft[j])
    				arrLeft[i] = arrLeft[j] + 1;
    		}
    	}
    	return arrLeft;
    }

    /**
     * 功能：从右到左，求到某点的最长递增子序列
     */
    private static int[] getRiseLongestSequenceRightToLeft(int[] arr) {
    	int[] arrRight = new int[arr.length];
    	for(int i = arr.length - 1; i >= 0; i--){
    		arrRight[i] = 1;
    		for(int j = arr.length - 1; j > i; j--){
    			if(arr[i] > arr[j] && arrRight[i] <= arrRight[j])
    				arrRight[i] = arrRight[j] + 1;
    		}
    	}
    	return arrRight;
    }

}