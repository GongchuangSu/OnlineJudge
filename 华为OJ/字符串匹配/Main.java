// 判断一个字符串中是否包含另一个字符串
public class Main {
    public static void main(String[] srgs) {
        char[] str = new char[] {
            'a', 'b', 'c', 'f', 'b', 'c', 'd'
        };
        char[] substr = new char[] {
            'b', 'c', 'd'
        };
        int max = str.length - substr.length;
        int i;

        for (i = 0; i <= max; i++) {
            // 寻找第一个字符匹配位置
            while (++i <= max && str[i] != substr[0]);

            // 查看其他字符是否匹配
            if (i <= max) {
                int j = i + 1;
                int k = 1;
                for (; k < substr.length && str[j] == substr[k]; k++, j++);
                if (k == substr.length) {
                    System.out.println("str字符串包含substr字符串");
                    System.out.printf("匹配位置：%d", j - substr.length);
                    break;
                }
            }
        }

        // str字符串不包含substr字符串
        if (i > max) {
            System.out.println("str字符串不包含substr字符串");
        }
    }
}