package leet;

/**
 * @author fengyadong
 * @date 2019/4/21 15:52
 * @description leetcode第477题 Total Hamming Distance
 */
public class TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int count = 0;
        int length = nums.length;
        for(int i = 0; i < 32; i ++){
            int countOfZero = 0;
            int countOfOne = 0;
            for(int j = 0; j < length; j ++){
                if((nums[j] & 1) == 0){
                    countOfZero++;
                } else {
                    countOfOne++;
                }
                nums[j] = nums[j] >> 1;
            }
            count = count + countOfOne * countOfZero;
        }
        return count;
    }

    public static void main(String[] args) {
        TotalHammingDistance totalHammingDistance = new TotalHammingDistance();
        int[] nums = {4,14,2};
        System.out.println(totalHammingDistance.totalHammingDistance(nums));

    }
}
