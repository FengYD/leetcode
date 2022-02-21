package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author fengyadong
 * @Description: <br/>
 * @Date: 2020-08-04 16:11<br/>
 */

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ss = solution.pushDominoes(".L.R...LR..L..");
        System.out.println(ss);
    }

    public String pushDominoes(String dominoes) {
        StringBuilder str = new StringBuilder(dominoes);
        boolean[] visited = new boolean[str.length()];
        Arrays.fill(visited, false);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '.') {
                visited[i] = true;
                list.add(i);
            }
        }

        while (!list.isEmpty()) {
            List<Integer> next = new ArrayList<>();
            for (Integer i : list) {
                if (str.charAt(i) == 'L') {
                    if (i - 1 >= 0 && !visited[i - 1]) {
                        if (str.charAt(i - 1) == '.') {
                            str.replace(i - 1, i, "L");
                        } else if (str.charAt(i - 1) == 'R') {
                            str.replace(i - 1, i, ".");
                        }
                        next.add(i - 1);
                    }
                } else {
                    if (i + 1 < str.length() && !visited[i + 1]) {
                        if (str.charAt(i + 1) == '.') {
                            str.replace(i + 1, i + 2, "R");
                        } else if (str.charAt(i - 1) == 'L') {
                            str.replace(i + 1, i + 2, ".");
                        }
                        next.add(i + 1);
                    }
                }
            }
            for (Integer i : next) {
                visited[i] = true;
            }
            list = next;
        }
        return str.toString();
    }
}


