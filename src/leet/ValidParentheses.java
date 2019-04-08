package leet;

import java.util.ArrayDeque;

/**
 * @program: leetcode
 * @description: leetcode第20题 Valid Parentheses
 * @author: fengyadong
 * @create: 2018-10-10 23:00
 **/
public class ValidParentheses {
    public boolean isValid(String s) {
        boolean result = false;
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()){
                stack.addLast(s.charAt(i));
            } else {
                if(s.charAt(i) == ')' && stack.getLast() == '('){
                    stack.removeLast();
                } else if(s.charAt(i) == '}' && stack.getLast() == '{') {
                    stack.removeLast();
                } else if(s.charAt(i) == ']' && stack.getLast() == '['){
                    stack.removeLast();
                } else {
                    stack.addLast(s.charAt(i));
                }
            }
        }

        result = stack.isEmpty();
        return result;
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "()[]{}";
        System.out.println(validParentheses.isValid(s));
    }
}
