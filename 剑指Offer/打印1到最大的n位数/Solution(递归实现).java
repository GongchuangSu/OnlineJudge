/**
 * 题目描述：输入数字n，按顺序打印出从1到最大的n位十进制数。
 * 测试样例：
 *           输入：3
 *           输出：1、2、3一直到最大的3位数即999
 * 解题思路：考虑大数问题，把问题转换成数字排列的解法
 * @author GongchuangSu
 * @since 2016.07.06
 */
public class Solution {
    public void printOneToNthDigits(int n) {
        if (n < 1) {
            throw new RuntimeException("The input number must larger than 0");
        }
        int[] arr = new int[n];
        printOneToNthDigits(0, arr);
    }

    public static void printOneToNthDigits(int n, int[] arr) {
        if (n >= arr.length) {
            printArray(arr);
        } else {
            for (int i = 0; i <= 9; i++) {
                arr[n] = i;
                printOneToNthDigits(n + 1, arr);
            }
        }
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