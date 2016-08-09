/**
 * @description 参数解析
 * @author GongchuangSu
 * @since 2016.08.09
 * @explain 请编写一个参数解析程序，实现将命令行各个参数解析出来。
 *          解析规则：
 *          1. 参数分隔符为空格 
 *          2.对于用“”包含起来的参数，如果中间有空格，不能解析为多个参数。
 *            比如在命令行输入xcopy /s “C:\program files” “d:\”时，参数
 *            仍然是4个，第3个参数应该是字符串C:\program files，而不是
 *            C:\program，注意输出参数时，需要将“”去掉，引号不存在嵌套情况。
 *          3.参数不定长
 *          4.输入由用例保证，不会出现不符合要求的输入 
 *          输入：输入一行字符串，可以有空格
 *          输出：输出参数个数，分解后的参数，每个参数都独占一行
 *          样例：
 *              输入：xcopy /s c:\\ d:\\
 *              输出：4
 *                    xcopy
 *                    /s
 *                    c:\\
 *                    d:\\  
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		String str = sc.nextLine();
    		char[] cs = str.toCharArray();
    		List<String> list = new ArrayList<>();
    		String temp = "";
    		boolean flag = true;
    		for(int i = 0; i < cs.length; i++){
    			if(cs[i] == '\"'){
    				flag = !flag;
    				continue;
    			}
    			
    			if(cs[i] != ' ' && flag){
    				temp += cs[i]; // 添加非引号内字符串
    			}else if(!flag){
    				temp += cs[i]; // 添加引号内字符串
    			}
    			
    			if(cs[i] == ' ' && flag){
    				list.add(temp + " ");
    				temp = "";
    			}	
    		}
    		list.add(temp);
    		System.out.println(list.size());
    		Iterator<String> iter = list.iterator();
    		while(iter.hasNext()){
    			System.out.println(iter.next());
    		}
    	}
    	sc.close();
    }     
}