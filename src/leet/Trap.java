package leet;

import java.util.Stack;

/**
 * @author fengyadong001
 * @date 2019/9/30 5:20 PM
 * @description
 */
public class Trap {

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int a = trap(height);
        System.out.println(a);
    }

    public static int trap(int[] height) {
        if (height.length == 0){
            return 0;
        }
        Stack<Integer> s = new Stack<>();
        int i = 0;
        int res = 0;
        int max = 0;
        while (i < height.length && height[i] == 0){i++;}
        while (i < height.length) {
            max = height[i];
            i = circle(height, i, s);
            if (i < height.length) {
                while (!s.isEmpty()) {
                    int t = s.pop();
                    res = res + (max - t);
                }
            } else {
                break;
            }
        }

        if (!s.isEmpty()) {
            max = s.pop();
            int t = 0;
            while (!s.isEmpty()) {
                t = s.pop();
                if (t < max) {
                    res = res + (max - t);
                } else {
                    max = t;
                }
            }
        }

        return res;
    }

    private static int circle(int[] height, int i, Stack<Integer> s){
        int max = height[i];
        s.push(max);
        for (i = i+1; i < height.length; i++){
            if (height[i] < max){
                s.push(height[i]);
            } else {
                return i;
            }
        }
        return i;
    }
}