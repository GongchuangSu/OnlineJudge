/**
 * @description 分隔字符串
 * @author GongchuangSu
 * @since 2016.03.30
 * @explain 根据指定的分隔符分割字符串，并输出指定的段
 * 			如果指定的段超过分割的段数，输出NULL
 * 			输入输出格式要求：输入分隔字符串长度小于128个字符，指定的段是一个正整数
 * 			例：AAA?BBB?CCC? ? 2
 *          字符串：AAA?BBB?CCC?
 *          分隔符：?
 *          指定的段数：2
 *          输出第二段字符串：BBB
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] str = line.split(" "); // str[0]：字符串 str[1]：分隔符 str[2]：指定的段数
            if (str.length > 2) {
                String[] a;
                // 注意分隔符不同，正则表达式也不同
                if (".$|()[{^?*+\\".indexOf(str[1]) == -1)
                    a = str[0].split(str[1]);
                else
                    a = str[0].split("\\" + str[1]);
                System.out.println(a[Integer.parseInt(str[2])]);
            }
        }
    }
}