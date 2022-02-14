package leet.tools;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author fengyadong
 * @Description: <br/>
 * @Date: 2022-02-12 19:19<br/>
 */
public class ArrayUtils {

    // 解析 leetcode 的输入，[1,2,3] -> {1,2,3}
    public static int[] readArray(String s) {
        JSONArray jsonArray = JSONArray.parseArray(s);

        int[] res = new int[jsonArray.size()];
        for (int i = 0; i < jsonArray.size(); i++) {
            res[i] = (int)jsonArray.get(i);
        }
        return res;
    }

    public static int[][] readArray2(String s) {
        JSONArray jsonArray = JSONArray.parseArray(s);

        int[][] res = new int[jsonArray.size()][];
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONArray sub = jsonArray.getJSONArray(i);
            int[] t = new int[sub.size()];
            for (int j = 0; j < sub.size(); j++) {
                t[j] = (int)jsonArray.get(i);
            }
            res[i] = t;
        }
        return res;
    }

    public static void printArray(String s){
        int[] arr = readArray(s);
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray2(String s) {
        int[][] matrix = readArray2(s);
        printArray2(matrix);
    }

    public static void printArray2(int[][] matrix) {
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

}
