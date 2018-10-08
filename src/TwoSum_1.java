import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @program: leetcode
 * @description: leetcode第1题TwoSum
 * @author: fengyadong
 * @create: 2018-09-16 21:01
 **/
public class TwoSum_1 {

    /**
     * 哈希思想
     * 只有一组结果，可以推断没有重复元素
     * 一边往哈希数组添加元素，一边检查
     * 提前break
     * */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            Integer key = target - nums[i];
            if(!map.containsKey(nums[i])){
                map.put(key, i);
            } else{
                res[0] = i;
                res[1] = map.get(nums[i]);
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        TwoSum_1 twoSum_1 = new TwoSum_1();
        int nums[] = {2,7,11,15};
        int target = 9;
        twoSum_1.twoSum(nums, target);
    }
}
