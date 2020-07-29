package http;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author fengyadong001
 * @date 2019/12/18 2:33 PM
 * @description
 */
public class Call {
    Map<String, String> map = new HashMap<>();

    public void t() {
        int[] a = new int[]{1,2};
        int[] b = IntStream.of(a).filter(i -> i/2 == 0).toArray();
        Stream.iterate(1, c -> c+1).limit(10).forEach(System.out::println);
        IntStream.rangeClosed(1, 10000).forEach(System.out::println);
    }

}