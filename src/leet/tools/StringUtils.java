package leet.tools;

/**
 * @program: leetcode
 * @description:
 * @author: fengyadong
 * @create: 2018-09-16 21:14
 **/
public class StringUtils {
    static String reverse(String str) {
        StringBuilder strReverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            strReverse.append(str.charAt(i));
        }
        return strReverse.toString();
    }
}
