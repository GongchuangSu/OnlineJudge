/**
 * @description 计算字符串的相似度
 * @author GongchuangSu
 * @since 2016.08.14
 * @explain 对于不同的字符串，我们希望能有办法判断相似程度，我们定义了一套操作方法来把两个不相同的字符串变得相同，具体的操作方法如下：
 *          1 修改一个字符，如把“a”替换为“b”。
 *          2 增加一个字符，如把“abdd”变为“aebdd”。
 *          3 删除一个字符，如把“travelling”变为“traveling”。
 *          比如，对于“abcdefg”和“abcdef”两个字符串来说，我们认为可以通过增加和减少一个“g”的方式来达到目的。
 *          上面的两种方案，都只需要一次操作。把这个操作所需要的次数定义为两个字符串的距离，而相似度等于“距离＋1”的倒数。
 *          也就是说，“abcdefg”和“abcdef”的距离为1，相似度为1/2=0.5.
 *          给定任意两个字符串，你是否能写出一个算法来计算出它们的相似度呢？
 *          输入：输入两个字符串
 *          输出：输出相似度，string类型
 *          样例：
 *              输入：abcdef
 *                    abcdefg
 *              输出：1/2
 * @知识点 字符串
 */
import java.util.*;

public class Main {

    /**
     * 功能：计算两字符串的近似度
     */
    public static String calculateStringDistance(String eA, String eB) {
        int[][] dif = new int[eA.length() + 1][eB.length() + 1];
        for (int i = 0; i <= eA.length(); i++) {
            dif[i][0] = i;
        }
        for (int i = 0; i <= eB.length(); i++) {
            dif[0][i] = i;
        }
        int temp = 0;
        for (int i = 1; i <= eA.length(); i++) {
            for (int j = 1; j <= eB.length(); j++) {
                if (eA.charAt(i - 1) == eB.charAt(j - 1)) {
                    temp = 0;
                } else {
                    temp = 1;
                }
                dif[i][j] = min(dif[i - 1][j - 1] + temp, dif[i][j - 1] + 1, dif[i - 1][j] + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        dif[eA.length()][eB.length()] += 1;
        sb.append(1 + "/" + dif[eA.length()][eB.length()]);
        return sb.toString();
    }

    /**
     * 功能：求三个数中最小的一个数
     */
    public static int min(int a, int b, int c) {
        int i = a < b ? a : b;
        return i < c ? i : c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            System.out.println(calculateStringDistance(str1, str2));
        }
        sc.close();
    }
}