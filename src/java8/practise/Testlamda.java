package java8.practise;

import java.util.HashMap;
import java.util.Optional;

/**
 * @author fengyadong001
 * @date 2019/9/3 8:17 PM
 * @description
 */
public class Testlamda {

    public static void main(String[] args) {
        String executionTime = Optional.ofNullable((Double) new HashMap<>().get("a"))
                .map(t -> t / 1e3)
                .map(t -> String.format("%.6f", t))
                .orElse(null);
        System.out.println("end");
    }



}