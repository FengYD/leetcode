package java8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fengyadong001
 * @date 2019/12/13 12:10 PM
 * @description
 */
public class TestRegex {

    private static Pattern p = Pattern.compile("^[a-zA-Z]+$");

    public static void main(String[] args) {
        Matcher matcher = p.matcher("123");
        matcher.matches();
    }
}