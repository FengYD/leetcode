import java.util.HashMap;

/**
 * @program: leetcode
 * @description: leetcode第13题 Roman to Integer
 * @author: fengyadong
 * @create: 2018-10-08 22:08
 **/
public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("I",1);
        hashMap.put("V",5);
        hashMap.put("X",10);
        hashMap.put("L",50);
        hashMap.put("C",100);
        hashMap.put("D",500);
        hashMap.put("M",1000);

        int nowValue = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if(hashMap.get(String.valueOf(s.charAt(i))) == nowValue){
                result += nowValue;
            }else if(hashMap.get(String.valueOf(s.charAt(i))) > nowValue){
                nowValue = hashMap.get(String.valueOf(s.charAt(i)));
                result += nowValue;
            }else {
                result -= hashMap.get(String.valueOf(s.charAt(i)));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        String s = "LVIII";
        System.out.println(romanToInteger.romanToInt(s));
    }

}
