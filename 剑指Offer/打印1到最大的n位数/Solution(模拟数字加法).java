/**
 * 题目描述：输入数字n，按顺序打印出从1到最大的n位十进制数。
 * 测试样例：
 *           输入：3
 *           输出：1、2、3一直到最大的3位数即999
 * 解题思路：在数组上模拟数字加法
 * @author GongchuangSu
 * @since 2016.07.06
 */
public class Solution {
	public static void printOneToNthDigits(int n) {
	    // 输入值必须大于0  
	    if (n < 1) {
	        throw new RuntimeException("The input number must larger than 0");
	    }
	    // 创建一个长度为n的数组  
	    int[] arr = new int[n];
	    // 为数组元素赋初始值  
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = 0;
	    }
	    // 求结果，如果最高位没有进位就一直进行处理  
	    while (addOne(arr) == 0) {
	        printArray(arr);
	    }
	}

	public static int addOne(int[] arr) {
	    // 保存进位值，因为每次最低位加1  
	    int carry = 1;
	    // 最低位的位置的后一位  
	    int index = arr.length;
	    do {
	        // 指向上一个处理位置  
	        index--;
	        // 处理位置的值加上进位的值  
	        arr[index] += carry;
	        // 求处理位置的进位  
	        carry = arr[index] / 10;
	        // 求处理位置的值  
	        arr[index] %= 10;
	    } while (carry != 0 && index > 0);
	    // 如果index=0说明已经处理了最高位，carry>0说明最高位有进位，返回1  
	    if (carry > 0 && index == 0) {
	        return 1;
	    }
	    // 无进位返回0  
	    return 0;
	}

	public static void printArray(int[] arr) {
	    // 找第一个非0的元素  
	    int index = 0;
	    while (index < arr.length && arr[index] == 0) {
	        index++;
	    }
	    // 从第一个非0值到开始输出到最后的元素。  
	    for (int i = index; i < arr.length; i++) {
	        System.out.print(arr[i]);
	    }
	    // 条件成立说明数组中有非零元素，所以需要换行  
	    if (index < arr.length) {
	        System.out.println();
	    }
	}
}