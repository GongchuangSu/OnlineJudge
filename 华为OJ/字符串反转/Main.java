/**
 * @description 字符串反转
 * @author GongchuangSu
 * @since 2016.03.29
 * @explain 实现"I am a student"反转成"student a am I"
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String line = sc.nextLine();
    	String[] str = line.split(" ");
    	StringBuffer sb = new StringBuffer();
     	for(int i = str.length - 1; i >= 0 ; i--){
    		sb.append(str[i] + " ");
    	}
     	System.out.println(sb.substring(0, sb.length() - 1));
    }
}