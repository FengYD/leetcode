package leet;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author fengyadong001
 * @date 2020/6/24 10:12 PM
 * @description
 */
public class Test {

    public static void main(String[] args) {
        int[] beans = new int[]{2,10,3,2};
        new Test().minimumRemoval(beans);
    }

    public long minimumRemoval(int[] beans) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int bean : beans) {
            map.put(bean, map.getOrDefault(bean, 0) + 1);
        }
        map.remove(0);
        if (map.size() == 1) {
            return 0;
        }
        Arrays.sort(beans);

        long[] sum = new long[beans.length];
        sum[0] = beans[0];
        for (int i = 1; i < beans.length; i++) {
            sum[i] = sum[i - 1] + (long)beans[i];
        }

        long[] cut = new long[beans.length];
        cut[cut.length - 1] = 0;
        for (int i = beans.length - 2; i >= 0; i--) {
            cut[i] = cut[i + 1] + ((long)beans[i + 1] - (long)beans[i]) * (long)((beans.length - 1) - i);
        }

        long count = Long.MAX_VALUE;

        for (int i = 1; i < beans.length; i++) {
            if (sum[i - 1] + cut[i] < count) {
                count = sum[i - 1] + cut[i];
            }
        }
        return count;
    }

    public long minimumRemoval2(int[] beans) {
        Map<Long, Long> map = new HashMap<>();
        for (int bean : beans) {
            map.put((long)bean, map.getOrDefault(bean, 0L) + 1);
        }
        map.remove(0);
        if (map.size() == 1) {
            return 0;
        }
        List<Map.Entry<Long, Long>> list = new ArrayList<>(map.entrySet());

        list.sort((e1, e2) -> (int)(e1.getKey() - e2.getKey()));


        long[] sum = new long[list.size()];
        long t = 0;
        int i = 0;
        for (Map.Entry<Long, Long> entry : list) {
            t += (entry.getKey() * entry.getValue());
            sum[i++] = t;
        }

        long[] cut = new long[list.size()];
        i = cut.length - 1;
        cut[i] = 0;
        long c = list.get(i).getValue();
        for (i = cut.length - 2; i >= 0; i--) {
            cut[i] = cut[i + 1] + c * (list.get(i + 1).getKey() - list.get(i).getKey());
            c += list.get(i).getValue();
        }

        long count = Long.MAX_VALUE;

        for (i = 1; i < list.size(); i++) {
            if (sum[i - 1] + cut[i] < count) {
                count = sum[i - 1] + cut[i];
            }
        }
        return count;
    }

}