/**
 * @description 合并表记录
 * @author GongchuangSu
 * @since 2016.08.07
 * @explain 数据表记录包含表索引和数值。请对表索引相同的记录进行合并，合并后表记录为相同索引表的数值求和 
 * 			输入：先输入键值对的个数，然后输入成对的index和value值，以换行符隔开
 *          输出：输出合并后的键值对（多行）
 *          样例：
 *              输入：4 0 1 0 2 1 2 3 4
 *              输出 ：0 3 1 2 3 4
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int count = Integer.valueOf(sc.nextLine());
        	TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        	while(count > 0){
        		int key = Integer.valueOf(sc.nextLine());
        		int value = Integer.valueOf(sc.nextLine());
        		treeMap.put(key, treeMap.containsKey(key) ? value + treeMap.get(key) : value);
        		count--;
        	}
        	for(Integer i : treeMap.keySet()){
        		System.out.println(i);
        		System.out.println(treeMap.get(i));
        	}        	
        }
    }
}