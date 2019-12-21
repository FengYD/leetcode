package java8.stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author fengyadong001
 * @date 2019/10/30 2:59 PM
 * @description
 */
public class Parallel {

    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6).parallel().forEach(System.out::println);
        Stream.of(1,2,3,4,5,6)
                .map(i -> i + 10)
                .peek(i -> System.out.println("peak:" + i))
                .parallel().forEach(System.out::println);
        Optional.ofNullable(123)
                .map(i -> i * i)
                .orElseGet(() -> 5);

    }

}