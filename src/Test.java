import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: leetcode
 * @description: Test
 * @author: fengyadong
 * @create: 2018-11-01 16:18
 **/
public class Test {
    public static void main(String[] args) {
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

        Float a = 0f/0f;
        System.out.println(a.equals(a));
    }
}
