/**
 * @description 字串的连接最长路径查找
 * @author GongchuangSu
 * @since 2016.08.08
 * @explain 给定n个字符串，请对n个字符串按照字典序排列。
 *          输入：输入第一行为一个正整数n(1≤n≤1000),下面n行为m个字符串(字符串长度≤100),字符串中只含有大小写字母。
 *          输出：数据输出n行，输出结果为按照字典序排列的字符串。
 * @解题思路 利用Collections.sort()排序
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int n = Integer.valueOf(sc.nextLine());
        	List<String> list = new ArrayList<>();
        	for(int i = 0; i < n; i++){
        		list.add(sc.nextLine());
        	}
        	Collections.sort(list);
        	Iterator<String> iter = list.iterator();
        	while(iter.hasNext()){
        		System.out.println(iter.next());
        	}       	
        }       
        sc.close();
    }
}