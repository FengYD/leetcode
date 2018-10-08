import java.util.HashMap;
import java.util.Map;

/**
 * @program: leetcode
 * @description: leetcode第771题Jewels and Stones
 * @author: fengyadong
 * @create: 2018-09-18 22:16
 **/
public class JewelsAndStones {
    /**
     * 题目比较简单
     * */
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        for (int i = 0; i < S.length(); i++) {
            if(J.contains(String.valueOf(S.charAt(i)))){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        jewelsAndStones.numJewelsInStones(J, S);
    }
}
