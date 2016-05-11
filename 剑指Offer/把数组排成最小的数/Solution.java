/**
 * 题目描述：输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 *           打印能拼接出的所有数字中最小的一个。
 * 测试样例：
 *           输入：{3，32，321}
 *           输出：321323
 * 解题思路：若"s1"+"s2" > "s2"+"s1"则"s2"一定在"s1"之前
 * @author GongchuangSu
 * @since 2016.05.11
 */
import java.util.ArrayList;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        String s = "";
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length; i++){
        	arrayList.add(numbers[i]);
        }
        while(!arrayList.isEmpty()){
        	int index = 0;
        	String s1 = arrayList.get(0).toString();
        	String s2 = "";
        	for(int i = 1; i < arrayList.size(); i++){
        		if(Integer.valueOf(arrayList.get(i).toString() + s1) > 
        		 Integer.valueOf(s1 + arrayList.get(i).toString())){
        			s2 = s1;         			
        		}else{
        			s2 = arrayList.get(i).toString();
        			s1 = s2;
        			index = i;
        		}
        	}
        	s += s2;
        	if(arrayList.size() == 1)
        		s += arrayList.get(0);
        	arrayList.remove(index);
        }   
        return s;
    }
}
// 运行时间：36ms
// 占用内存：629k