package leet;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author fengyadong001
 * @date 2020/6/24 10:12 PM
 * @description
 */
public class Test {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums2).filter(e -> set.contains(e)).distinct().toArray();
    }

}