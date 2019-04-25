package leet;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fengyadong001
 * @date 2019/4/22 11:14 PM
 * @description Leetcode 第10题 Regular Expression Matching
 */
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        List<Character> str = s.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        List<Character> pattern = p.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        return match(str, pattern);
    }

    public boolean match(List<Character> str, List<Character> pattern){
        if(str.size() == 0 && pattern.size() == 0){
            return true;
        }

        int m = str.size() - 1;
        int n = pattern.size() - 1;

        while (m > -1 && n > -1){
            if(pattern.get(n).equals('*')){
                boolean r1;
                boolean r2 = match(str.subList(0, m+1), pattern.subList(0, n-1));
                boolean r3;
                if(pattern.get(n-1).equals('.') ||str.get(m).equals(pattern.get(n-1))){
                    r1 = match(str.subList(0, m), pattern.subList(0, n-1));
                    r3 = match(str.subList(0, m), pattern.subList(0, n+1));
                } else {
                    r1 = false;
                    r3 = false;
                }
                return r1 || r2 || r3;

            } else if(pattern.get(n).equals('.') || str.get(m).equals(pattern.get(n))){
                m--;
                n--;
            } else {
                break;
            }

        }

        if(m == -1 && n != -1){
            while (n > -1){
                if(pattern.get(n).equals('*')){
                    n = n-2;
                } else {
                    break;
                }
            }
        }

        if(m == -1 && n == -1){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        System.out.println(regularExpressionMatching.isMatch("aaa", "ab*ac*a"));
    }
}