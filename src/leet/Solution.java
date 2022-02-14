package leet;

import leet.tools.ArrayUtils;

import java.util.*;

/**
 * @author fengyadong
 * @Description: <br/>
 * @Date: 2020-08-04 16:11<br/>
 */

class Solution {

    public static void main(String[] args) {
        new Solution().singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11});
    }

    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            if (nums[mid] == nums[mid - 1]) {
                if ((mid - l + 1) % 2 == 0) {
                    l = mid + 1;
                } else {
                    r = mid - 2;
                }
            }
            if (nums[mid] == nums[mid + 1]) {
                if ((mid + 1 - l + 1) % 2 == 0) {
                    l = mid + 2;
                } else {
                    r = mid - 1;
                }
            }
        }
        return nums[l];
    }
}


