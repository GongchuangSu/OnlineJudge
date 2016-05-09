/**
 * @description 最大数
 * @author GongchuangSu
 * @since 2016.03.30
 * @explain 输入一串数字，从中选取三个不同的数构成一个最大值的三位数
 * 			例：输入 123667 输出 763
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(getMaxNumber(num));
    }

    /**
     * 功能：取构成最大的三位数
     */
    private static int getMaxNumber(int num) {
        char[] max = new char[3];
        int min, index = 0;
        char[] c = String.valueOf(num).toCharArray();
        // 利用简单选择排序选择最大值，若找到满足条件的三位数，则停止选择
        for (int i = 0; i < c.length - 1 && max[2] == '\0'; i++) {
            // 将当前下标定义为最小值下标
            min = i;
            for (int j = i + 1; j < c.length; j++) {
                // 如果有小于当前最小值的关键字，则将此关键字的下标赋值给min
                if (c[min] < c[j])
                    min = j;
            }
            // 如果min不等于i，说明找到比sqList[i]更小的值，则进行交换
            if (i != min)
                swap(c, i, min);
            // 将取得的最大不重复数写入max[]
            if (i == 0) {
                max[index] = c[i];
                index++;
            } else if (c[i] != c[i - 1]) {
                max[index] = c[i];
                index++;
            }
        }
		// 若不存在满足条件的三位数，则返回-1
        if(index != 3)
        	return -1;
        return Integer.parseInt(String.valueOf(max));
    }

    /**
     * 功能：交换数据
     * c： char型数组
     * a： 数组下标
     * b： 数组下标
     */
    private static void swap(char[] c, int a, int b) {
        char temp;
        temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
}