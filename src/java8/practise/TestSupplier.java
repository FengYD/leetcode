package java8.practise;

import java.util.function.Supplier;

/**
 * @author fengyadong001
 * @date 2019/8/21 3:09 PM
 * @description
 */
public class TestSupplier {
    private static Supplier<String> stringSupplier;

    public static void main(String[] args) {
        stringSupplier = String::new;
        for (int i = 1; i < 10; i++){
            System.out.println(stringSupplier.get());
        }

    }

}