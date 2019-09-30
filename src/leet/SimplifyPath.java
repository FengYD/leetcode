package leet;

import java.util.Stack;

/**
 * @author fengyadong001
 * @date 2019/9/30 6:11 PM
 * @description
 */
public class SimplifyPath {
    public static String simplifyPath(String path) {
        String[] p = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String s : p){
            if (s.equals("") || s.equals(".")){

            } else if (s.equals("..")){
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(s);
            }
        }
        if (stack.isEmpty()){
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.insert(0, stack.pop());
            sb.insert(0, "/");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String path = "/home/";
        String s = simplifyPath(path);
        System.out.println(s);
    }

}