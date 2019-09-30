package leet;

import java.util.Arrays;

/**
 * @author fengyadong
 * @date 2019/5/12 1:14
 * @description Leetcode第561题 Array Partition I
 */
public class ArrayPartitionI {

    /**
     * [2,3,1,4] 排序是 [1,2,3,4] 返回 1+3
     * */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i = 0; i < nums.length/2; i++){
            res += nums[2 * i];
        }
        return res;
    }


    /**
     * 用了类似 map 的方法，更加接近竞赛的思维
     * 题目的目的是找到需要用的数据，排序可以完成，但是排序时间复杂度起码是O(nlogn)
     * */
    public int answer(int[] nums) {
        //因为数据有范围，统计每个数字的数量
        int[] count = new int[20001];
        for (int num : nums) {
            count[num + 10000]++;
        }

        int i = 0;
        int ans = 0;
        for (int j = 0; j < count.length; j++) {
            while (count[j] > 0) {
                if (i % 2 == 0) {
                    ans += j - 10000;
                }
                i++;
                count[j]--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayPartitionI arrayPartitionI = new ArrayPartitionI();
        int[] nums = {2,3,1,4};
        System.out.println(arrayPartitionI.arrayPairSum(nums));
    }
}
