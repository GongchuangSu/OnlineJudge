/**
 * @description 字符串最后一个单词的长度
 * @author GongchuangSu
 * @since 2016.03.29
 * @expain 输入描述：一行字符串
 *         输出描述：整数N，最后一个单词的长度
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {        
            // 使用 BufferedReader 在控制台读取字符
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            String[] str = line.split(" ");
            System.out.println(str[str.length - 1].length());
    }
}