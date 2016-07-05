/**
 * 题目描述：在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 *           每一列都按照从上到下递增的顺序排序。请完成一个函数，
 *           输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。 
 * 测试样例：
 *           输入：array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
 *                 target = 7;
 *           输出：true
 * 解题思路：选取右上角的数字，如果该数字等于要查找的数字，查找结束并返回true；
 *           如果该数字大于要查找的数字，删除该数字所在列；
 *           如果该数字小于要查找的数字，删除该数字所在行；
 * @author GongchuangSu
 * @since 2016.07.05
 */
public class Solution {
	public boolean Find(int[][] array, int target) {
		boolean isFound = false;
		if (array == null)
			return isFound;
		int rows = array.length;
		int columns = array[0].length;
		int row = 0;
		while (rows > 0 && columns > 0) {
			if (array[row][columns - 1] == target) {
				isFound = true;
				break;
			} else if (array[row][columns - 1] > target)
				columns--;
			else {
				rows--;
				row++;
			}
		}
		return isFound;
	}
}
//运行时间：127ms
//占用内存：5019k