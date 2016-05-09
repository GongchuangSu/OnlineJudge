/**
 * @description 字符串逆序
 * @author GongchuangSu
 * @since 2016.03.29
 * @explain 将一个字符串str的内容颠倒过来，并输出。
 *          str的长度不超过100个字符。 如：输入“I am a student”，输出“tneduts a ma I”。
 */
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 使用 BufferedReader 在控制台读取字符
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder(line);
        sb.reverse();
        System.out.println(sb.toString());
    }
}