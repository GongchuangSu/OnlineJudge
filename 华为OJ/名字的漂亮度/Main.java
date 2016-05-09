/**
 * @description 名字的复杂度
 * @author GongchuangSu
 * @since 2016.03.29
 * @explain 给出一个名字，该名字有26个字符串组成，定义这个字符串的“漂亮度”是其所有字母“漂亮度”的总和。
 *          每个字母都有一个“漂亮度”，范围在1到26之间。没有任何两个字母拥有相同的“漂亮度”。字母忽略大小写。
 *          给出多个名字，计算每个名字最大可能的“漂亮度”。
 *          名字的漂亮度=26*字母个数最多的+25*字母个数其次的+24*字母个数再其次的……
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            scanner.nextLine();
            String[] str = new String[N];
            for (int i = 0; i < N; i++) {
                str[i] = scanner.nextLine();
                int[] arr = new int[26];
                for (int j = 0; j < str[i].length(); j++) {
                    char c = Character.toLowerCase(str[i].charAt(j)); // 如果为大写字母，则转换为小写字母
                    arr[c - 'a'] = arr[c - 'a'] + 1; // 字母出现次数统计
                }
                Arrays.sort(arr); // 对数组中数值进行大小排序
                int v = 26;
                int count = 0;
                for (int k = arr.length - 1; k >= 0; k--) {
                    count = count + v * arr[k];
                    v--;
                    if (arr[k] == 0)
                        break;
                }
                System.out.print(count);
            }
        }
    }
}