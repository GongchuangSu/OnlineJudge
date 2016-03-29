/**
 * @description 字符串反转
 * @author GongchuangSu
 * @since 2016.03.29
 * @explain 实现"I am a student"反转成"student a am I"
 */
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        int i = 0, j = 0;
        char temp;
        char[] str;
        // 使用 BufferedReader 在控制台读取字符
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder(line);
        // 先进行全盘反转
        j = sb.length() - 1;
        str = sb.toString().toCharArray();
        while (i < j) {
            temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        System.out.println(str);
        // 再进行部分反转，如果不是空格则开始反转单词
        i = 0;
        while (i < sb.length() - 1) {
            int begin = 0, end = 0;
            if (str[i] != ' ') {
                begin = i;
                while (i < sb.length() && str[i] != ' ') {
                    end = i;
                    i++;
                }
            }
            while (begin < end) {
                temp = str[begin];
                str[begin] = str[end];
                str[end] = temp;
                begin++;
                end--;
            }
            i++;
        }
        System.out.println(str);
    }
}