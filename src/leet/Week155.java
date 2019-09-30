package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week155 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int a = 100000000;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++){
            if (arr[i] - arr[i-1] < a){
                a = arr[i]-arr[i-1];
                res.clear();
                List<Integer> tmp = new ArrayList<>();
                tmp.add(arr[i-1]);
                tmp.add(arr[i]);
                res.add(tmp);
            } else if(arr[i] - arr[i-1] == a){
                List<Integer> tmp = new ArrayList<>();
                tmp.add(arr[i-1]);
                tmp.add(arr[i]);
                res.add(tmp);
            }
        }
        return res;
    }

}
