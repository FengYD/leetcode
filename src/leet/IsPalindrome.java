package leet;

/**
 * @program: leetcode
 * @description:leetcode第9题IsPalindrome
 * @author: fengyadong
 * @create: 2018-09-16 21:48
 **/
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if(x < 0){return false;}
        StringBuilder sb = new StringBuilder();
        while (x != 0){
            sb.append(x%10);
            x = x/10;
        }
        String s = sb.toString();
        if(s.length() != 0){
            for(int i = 0; i < s.length()/2; i++){
                if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(1));
    }
}
