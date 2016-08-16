/**
 * @description 字符串排序
 * @author GongchuangSu
 * @since 2016.08.16
 * @explain 编写一个程序，将输入字符串中的字符按如下规则排序。
 *          规则1：英文字母从A到Z排列，不区分大小写。
 *                如，输入：Type 输出：epTy
 *          规则2：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 *                如，输入：BabA 输出：aABb
 *          规则3：非英文字母的其它字符保持原来的位置。
 *                如，输入：By?e 输出：Be?y
 *          输入：输入一串字符
 *          输出：输串一串字符
 *          样例：
 *             输入：A Famous Saying: Much Ado About Nothing(2012/8).
 *             输出：A aaAAbc dFgghh: iimM nNn oooos Sttuuuy(2012/8).
 * @知识点 字符串，排序
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            char[] charArray = str.toCharArray();

            ArrayList < Character > list = new ArrayList < Character > ();
            ArrayList < Map < Character, Integer >> sList = new ArrayList < Map < Character, Integer >> ();
            for (int i = 0; i < charArray.length; ++i) {
                if (!isEngLetter(charArray[i])) {
                    Map < Character, Integer > map = new HashMap < Character, Integer > ();
                    map.put(charArray[i], i);
                    sList.add(map);
                } else {
                    list.add(charArray[i]);
                }
            }
            char[] newChar = new char[list.size()];
            for (int j = 0; j < list.size(); ++j) {
                newChar[j] = list.get(j);
            }
            StringBuilder builder = new StringBuilder(String.valueOf(sortSmallToLarge(newChar)));
            for (int k = 0; k < sList.size(); ++k) {
                Map < Character, Integer > smap = sList.get(k);
                Set < Entry < Character, Integer >> entrySet = smap.entrySet();
                Iterator < Entry < Character, Integer >> ite = entrySet.iterator();
                while (ite.hasNext()) {
                    Map.Entry < Character, Integer > entry = (Map.Entry < Character, Integer > ) ite.next();
                    builder.insert(entry.getValue().intValue(), entry.getKey().charValue());
                }
            }
            System.out.print(builder.toString());
            scanner.close();
        }


    }

    /**
     * 功能：判断字符是否为英文字母
     */
    private static boolean isEngLetter(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        } else if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    /**
     * 功能：通过冒泡排序将字符进行排序
     */
    private static char[] sortSmallToLarge(char[] a) {
        char temp = 0;
        for (int i = a.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (!String.valueOf(a[j + 1]).toLowerCase().equals(String.valueOf(a[j]).toLowerCase())) {
                    if (String.valueOf(a[j + 1]).toLowerCase().compareTo(String.valueOf(a[j]).toLowerCase()) < 0) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }
        return a;
    }
}