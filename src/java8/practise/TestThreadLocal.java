package java8.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author fengyadong001
 * @date 2019/9/3 2:15 PM
 * @description
 */
public class TestThreadLocal {

    public static void main(String[] args) {
        List<Runnable> l = new ArrayList<>();
        l.stream().forEach(Runnable::run);
        List<Integer> l1 = new ArrayList<>();
        l1.forEach(System.out::println);
        String s = "0";
        Supplier<Integer> a = () -> Integer.parseInt(s);
        Supplier<String> b = () -> s.toString();
        System.out.println(a.get());

    }
}