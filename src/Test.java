import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;

/**
 * @program: leetcode
 * @description: Test
 * @author: fengyadong
 * @create: 2018-11-01 16:18
 **/
public class Test {


    public static void main(String[] args) {
        java.lang.reflect.Proxy proxy;
        Integer i;
        Long ll;
        String s;
        Class c = int.class;
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.remove("1");
        new Thread().start();
        //Thread;
        HashMap map1;
        ConcurrentHashMap cmap1;
        ThreadLocal t1;
        ThreadPoolExecutor e;
        Executors a;
        Executors.class.getClassLoader();
        String randomStr = RandomStringUtils.random(16, true, true);
        System.out.println(randomStr);
        String[] strs = {"java", "is", "esay", "to", "use", "java"};
        List<String> ds = Arrays.stream(strs)
                .map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(ds);
        List<String[]> ds1 = Arrays.stream(strs)
                .map(str -> str.split(""))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(ds1);
        List<String[]> ds2 = Arrays.stream(strs)
                .map(str -> str.split(""))
                .limit(1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(ds2);

        //Float a = 0f/0f;
        //System.out.println(a.equals(a));
    }
}
