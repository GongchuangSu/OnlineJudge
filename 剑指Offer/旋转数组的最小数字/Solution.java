/**
 * 题目描述：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *           输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 解题思路：要考虑特殊情况 1、数组为空 2、部分旋转 3、完全旋转
 *           若要追求效率，可考虑使用二分法
 *           若只要求解出答案，可遍历数组
 * 测试样例：
 *           输入：{3,4,5,1,2}
 *           输出：1
 * @author GongchuangSu
 * @since 2016.07.06
 */
public class Solution {
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        if (array[0] < array[array.length - 1])
            return array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1])
                return array[i + 1];
        }
        return 0;
    }
}
// 运行时间：138ms
// 占用内存：3940k
