package leet;

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

        int[] byteMap = new int[128];
        byteMap['I'] = 1;
        byteMap['V'] = 5;
        byteMap['X'] = 10;
        byteMap['L'] = 50;
        byteMap['C'] = 100;
        byteMap['D'] = 500;
        byteMap['M'] = 1000;


        int nowValue = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if(byteMap[s.charAt(i)] == nowValue){
                result += nowValue;
            }else if(byteMap[s.charAt(i)] > nowValue){
                nowValue = byteMap[s.charAt(i)];
                result += nowValue;
            }else {
                result -= byteMap[s.charAt(i)];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        String s = "MCMXCIV";
        System.out.println(romanToInteger.romanToInt(s));
    }

}
