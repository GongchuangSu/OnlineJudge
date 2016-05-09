/**
 * @description 字符串反转(利用Stack实现)
 * @author GongchuangSu
 * @since 2016.04.12
 * @explain 实现"I am a student"反转成"student a am I"
 */
import java.io.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        // 使用 BufferedReader 在控制台读取字符
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder(line);
        // 创建Stack类
        Stack < String > stack = new Stack < String > ();
        for (String string: sb.toString().split(" "))
            stack.push(string);
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}