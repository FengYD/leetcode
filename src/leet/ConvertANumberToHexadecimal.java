package leet;

import leet.tools.StringUtils;

/**
 * @author fengyadong
 * @date 2019/4/21 16:07
 * @description Leetcode 第405题 Convert a Number to Hexadecimal
 */
public class ConvertANumberToHexadecimal {

    public String toHex(int num) {
        if(num == 0){ return "0";}
        StringBuilder hexNum = new StringBuilder();
        //String sign = (num > 0)? "" : "-";
        //num = Math.abs(num);
        for(int i = 0; i < 8; i = i + 1) {
            int charA = 0;
            for (int j = 0; j < 4; j++) {
                int bit = num & 1;
                charA += (bit == 0) ? 0 : Math.pow(2, j);
                num = num >> 1;
            }

            if (charA == 0 && num == 0) {
            } else if (charA < 10) {
                hexNum.append(charA);
            } else if (charA == 10) {
                hexNum.append("a");
            } else if (charA == 11) {
                hexNum.append("b");
            } else if (charA == 12) {
                hexNum.append("c");
            } else if (charA == 13) {
                hexNum.append("d");
            } else if (charA == 14) {
                hexNum.append("e");
            } else if (charA == 15) {
                hexNum.append("f");
            }

            if (num == 0) {
                break;
            }
        }
        return hexNum.reverse().toString();
    }

    public static void main(String[] args) {
        ConvertANumberToHexadecimal toHexadecimal = new ConvertANumberToHexadecimal();
        System.out.println(toHexadecimal.toHex(26));
        System.out.println(toHexadecimal.toHex(-1));
        System.out.println(toHexadecimal.toHex(0));
    }
}
