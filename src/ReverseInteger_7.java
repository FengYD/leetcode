import tools.StringUtils;

/**
 * @program: leetcode
 * @description: leetcode第7题ReverseInteger
 * @author: fengyadong
 * @create: 2018-09-16 21:01
 **/
public class ReverseInteger_7 {
    public int reverse(int x) {
        int res = 0;
        long abs_x = Math.abs((long)x);
        boolean tag = (x == abs_x) ? false : true;
        String str = String.valueOf(abs_x);
        StringBuilder strReverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            strReverse.append(str.charAt(i));
        }

        long tmp = Long.parseLong(strReverse.toString());
        if(tmp < Integer.MAX_VALUE){
            if(tag){
                res = 0 - (int)tmp;
            } else {
                res = (int)tmp;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ReverseInteger_7 reverseInteger_7 = new ReverseInteger_7();
        System.out.println(reverseInteger_7.reverse(-2147483648));
        System.out.println(reverseInteger_7.reverse(-123));
        System.out.println(reverseInteger_7.reverse(120));
    }
}
