package leet;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author fengyadong001
 * @date 2019/12/19 9:24 PM
 * @description
 */
public class ClimbStair {

    public static void main(String[] args) {
        int n = 4;
        int i = Stream.iterate(new int[]{0,1}, t -> {int a = t[0]; t[0] = t[1]; t[1] = a+t[1]; return t;}).limit(n+2)
                .flatMapToInt(t -> Arrays.stream(t).limit(1))
                .reduce((a,b) -> b)
                .orElse(0);
        int m = 1;
    }

}