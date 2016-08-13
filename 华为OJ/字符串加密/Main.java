/**
 * @description 字符串加密
 * @author GongchuangSu
 * @since 2016.08.13
 * @explain 有一种技巧可以对数据进行加密，它使用一个单词作为它的密匙。下面是它的工作原理：
 *          首先，选择一个单词作为密匙，如TRAILBLAZERS。如果单词中包含有重复的字母，只保
 *          留第1个，其余几个丢弃。现在，修改过的那个单词死于字母表的下面，如下所示：
 *                      A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 *                      T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
 *          上面其他用字母表中剩余的字母填充完整。在对信息进行加密时，信息中的每个字母被固
 *          定于顶上那行，并用下面那行的对应字母一一取代原文的字母(字母字符的大小写状态应该保留)。
 *          输入：先输入key和要加密的字符串
 *          输出：返回加密后的字符串
 *          样例：
 *              输入：nihao
 *                    ni
 *              输出：le
 * @知识点 字符串
 */
import java.util.*;

public class Main {
	
	/**
	 * 功能：去出字符串中的重复字符
	 */
	public static char[] removeRepeat(char[] c){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < c.length; i++){
			if(!sb.toString().contains(String.valueOf(c[i])))
				sb.append(c[i]);
		}
		return sb.toString().toCharArray();
	} 
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {        	
        	char[] key = sc.nextLine().toCharArray();
        	char[] src = sc.nextLine().toCharArray();
            char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            		'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            		'a', 'b', 'c', 'd','e', 'f', 'g', 'h','i', 'j', 'k', 'l','m', 
            		'n', 'o', 'p','q', 'r', 's', 't','u', 'v', 'w', 'x', 'y', 'z'};
        	key = removeRepeat(key);
        	StringBuffer sb = new StringBuffer(String.valueOf(key));
        	for(int i = 0; i < c.length; i++){
        		if(!sb.toString().contains(String.valueOf(c[i])))
        			sb.append(c[i]);
        	}
        	StringBuffer result = new StringBuffer();
        	for(int j = 0; j < src.length; j++){
        		result.append(sb.charAt(String.valueOf(c).indexOf(src[j])));
        	}
        	System.out.println(result.toString());
        }
        sc.close();
    }
}