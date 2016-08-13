/**
 * @description 配置文件恢复
 * @author GongchuangSu
 * @since 2016.08.13
 * @explain 描述请参照同目录下的README
 *          输入：多行字符串，每行字符串一条命令
 *          输出：执行结果，每条命令输出一行
 *          样例：
 *              输入：reset
 *                    reset board
 *                    board add
 *                    board delet
 *                    reboot backplane
 *                    backplane abort
 *              输出：reset what
 *                    board fault
 *                    where to add
 *                    no board at all
 *                    impossible
 *                    install first
 * @知识点 字符串
 */
import java.util.*;

public class Main {
	
	/**
	 * 功能：查看两个字符串是否匹配
	 */
	public static boolean isMatch(String src, String des){
		char[] c1 = src.toCharArray();
		char[] c2 = des.toCharArray();
		int i = 0;
		while(i < c1.length && i < c2.length){
			if(c1[i] == c2[i])
				i++;
			else
				break;
		}
		if(i == c1.length)
			return true;
		else 
			return false;
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> hMap = new HashMap<>();
        hMap.put("reset", "reset what");
        hMap.put("reset board", "board fault");
        hMap.put("board add", "where to add");
        hMap.put("board delet", "no board at all");
        hMap.put("reboot backplane", "impossible");
        hMap.put("backplane abort", "install first");
        while (scanner.hasNext()) {
        	String[] strs = scanner.nextLine().split(" ");
        	int count = 0; // 记录匹配个数
        	Set<String> set = hMap.keySet();
        	String key = "";
        	for(String s : set){
        		String[] temps = s.split(" ");
        		if(temps.length == strs.length){
        			int i = 0;
        			while(i < temps.length){
        				if(isMatch(strs[i], temps[i]))
        					i++;
        				else
        					break;
        			}
        			if(i == temps.length){ // 找到匹配
        				key = s;
        				count++;
        			}       				
        		}
        	}
        	if(count != 1)
        		System.out.println("unkown command");
        	else
        		System.out.println(hMap.get(key));
        		
        }
        scanner.close();
    }
}