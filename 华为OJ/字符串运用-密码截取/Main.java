/**
 * @description 字符串运用-密码截取
 * @author GongchuangSu
 * @since 2016.08.11
 * @explain Catcher是MCA国的情报员，他工作时发现敌国会用一些对称的密码进行通信，比如像这些ABBA，ABA，A，123321，
 *          但是他们有时会在开始或结束时加入一些无关的字符以防止别国破解。比如进行下列变化 ABBA->12ABBA,ABA->ABAKK,
 *          123321->51233214　。因为截获的串太长了，而且存在多种可能的情况（abaaab可看作是aba,或baaab的加密形式）,
 *          Cathcer的工作量实在是太大了，他只能向电脑高手求助，你能帮Catcher找出最长的有效密码串吗？
 *          输入：输入一个字符串
 *          输出：返回有效密码串的最大长度
 *          样例：
 *              输入：abaaab
 *              输出：5
 * @知识点    字符串
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	String str = sc.nextLine();
            char[] cs = str.toCharArray();
            int length = cs.length;
            int i = 0;
            int count = 0;
            while(i < length){
            	int last = length - 1;
            	while(i != last){
            		if(cs[i] == cs[last]){
            			String subStr = str.substring(i, last + 1);
            			if(subStr.equals(reverse(subStr))){
            				if(subStr.length() > count)  // 取最大长度
            					count = subStr.length();
            				break;
            			}
            		}
            		last--;
            	}
            	i++;
            }
            System.out.println(count);
        }
        sc.close();
    }
    
    /**
     * 功能：字符串反转
     */
    public static String reverse(String str){
    	List<Character> list = new ArrayList<>();
    	char[] cs = str.toCharArray();
    	for(int i = 0; i < cs.length; i++){
    		list.add(cs[i]);
    	}
    	Collections.reverse(list);
    	StringBuffer sb = new StringBuffer();
    	for(Character c : list){
    		sb.append(c);
    	}
    	return sb.toString();
    }
}