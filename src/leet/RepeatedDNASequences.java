package leet;

import java.util.*;

/**
 * @author fengyadong
 * @date 2019/4/21 16:37
 * @description Leetcode第187题 Repeated DNA Sequences
 */
public class RepeatedDNASequences {

    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length() < 11){ return new ArrayList<>();}
        int[] f = new int[128];
        f['A'] = 1;
        f['C'] = 2;
        f['G'] = 3;
        f['T'] = 0;
        Set<String> result = new HashSet<>();
        boolean[] bitMap = new boolean[1<<20];
        int tmp = 0;
        for(int t = 0; t < 10; t++){
            tmp |= (f[s.charAt(t)] << (2*t));
        }
        bitMap[tmp] = true;
        for(int i = 1; i < s.length() - 9; i++){
            tmp = tmp >> 2;
            tmp |= (f[s.charAt(i+9)] << 18);
            if(bitMap[tmp]){
                result.add(s.substring(i, i + 10));
            } else {
                bitMap[tmp] = true;
            }
        }
        return new ArrayList<>(result);
    }


    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        RepeatedDNASequences repeatedDNASequences = new RepeatedDNASequences();
        System.out.println(repeatedDNASequences.findRepeatedDnaSequences(s));
    }


    /**下面是一个很好的答案，用了很多技巧*/
    /**位移比幂指数快*/
    /**bitmap比哈希快*/
/*
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() <= 10) { //提前退出
            return new ArrayList<>();
        }
        boolean[] firstSeen = new boolean[1 << 20]; //在结果数量可以预期的时候，使用bitmap
        Set<String> secondSeen = new HashSet<>();   //set去重
        int val = 0;    // need to use the first 20 bits of the int to store letter information
        int[] mapping = new int[128];   //这里是个很重要的操作，使用ByteMap一定比hashmap快很多，因为这是一个很高频的操作
        mapping['A'] = 0; // 00
        mapping['C'] = 1; // 01
        mapping['G'] = 2; // 10
        mapping['T'] = 3; // 11

        for (int i = 0; i < 10; i++) {
            val <<= 2;
            val |= mapping[s.charAt(i)];    //有意思的技巧
        }
        firstSeen[val] = true;

        int mask = 0xFFFFF;
        for (int i = 10; i < s.length(); i++) {
            val <<= 2;
            val &= mask;
            val |= mapping[s.charAt(i)];
            if (firstSeen[val]) {
                secondSeen.add(s.substring(i - 9, i + 1));
            } else {
                firstSeen[val] = true;
            }
        }
        return new ArrayList<>(secondSeen);
    }
    */
}
