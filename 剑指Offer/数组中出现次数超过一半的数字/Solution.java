/**
 * 题目描述：数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 测试样例：
 *           输入：{1,2,3,2,2,2,5,4,2}
 *           输出：2
 * 解题思路：两个for循环对每个进行统计并判断
 * @author GongchuangSu
 * @since 2016.05.11
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array==null) {
             return 0;
        }
        int i=0;
        int sum=0;
        for (; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]){
                    sum++;
                }
            }
            if (sum > (array.length/2.0)) {
                return array[i];
            }else {
                sum = 0;
            }
        }
        return 0; 
    }
}
// 运行时间：26ms
// 占用内存：669k