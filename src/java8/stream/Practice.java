package java8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author fengyadong001
 * @date 2019/10/18 2:19 PM
 * @description
 */
public class Practice {

    public static void main(String[] args) {
        //Stream.of(1,2).map(i -> i*i).forEach(System.out::println);
        //Stream.iterate(1, i -> i+1).limit(10).forEach(System.out::println);
        //Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0]+t[1]}).limit(10)
          //      .flatMapToInt(t -> IntStream.of(t[0])).forEach(System.out::println);
        //Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0]+t[1]}).limit(10)
          //      .flatMapToInt(t -> Arrays.stream(t).limit(1)).forEach(System.out::println);
        //Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0]+t[1]}).limit(10)
                //.flatMapToInt(Arrays::stream).forEach(System.out::println);
        Stream<int[]> pythagoreanTriples = IntStream.rangeClosed(1,100).boxed().flatMap(
                a -> IntStream.rangeClosed(a, 100)
                        .filter(b -> Math.sqrt(a*a + b*b)%1 == 0)
                .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a*a + b*b)})
        );
        pythagoreanTriples.limit(5).forEach(t -> System.out.println(t[0] + " " + t[1] + " " + t[2]));

        Stream<double[]> pythagoreanTriples2 = IntStream.rangeClosed(1,100).boxed().flatMap(
                a -> IntStream.rangeClosed(a, 100)
                        .mapToObj(b -> new double[]{a, b,  Math.sqrt(a*a + b*b)})
                        .filter(t -> t[2]%1==0)
        );
        pythagoreanTriples2.limit(5).forEach(t -> System.out.println(t[0] + " " + t[1] + " " + t[2]));
    }

}