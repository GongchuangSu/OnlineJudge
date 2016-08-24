/**
 * @description 调整数组顺序使奇数位于偶数前面
 * @author GongchuangSu
 * @since 2016.08.24
 * @explain 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 *          所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。  
 */
import java.util.*;

public class Solution{
	
    public void reOrderArray(int [] array) {
    	List<Integer> a = new ArrayList<>();
    	List<Integer> a1 = new ArrayList<>(); // 存放奇数
    	List<Integer> a2 = new ArrayList<>(); // 存放偶数
        for(int i = 0; i < array.length; i++){
        	if(array[i] % 2 == 0)
        		a2.add(array[i]);
        	else
        		a1.add(array[i]);
        }
        Iterator<Integer> iter1 = a1.iterator();
        while(iter1.hasNext())
        	a.add(iter1.next());
        Iterator<Integer> iter2 = a2.iterator();
        while(iter2.hasNext())
        	a.add(iter2.next());
        for(int j = 0; j < array.length; j++)
        	array[j] = a.get(j);
    }
}

