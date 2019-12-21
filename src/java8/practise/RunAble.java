package java8.practise;

/**
 * @author fengyadong001
 * @date 2019/10/12 12:34 PM
 * @description
 */

public class RunAble {

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("a");
        Class clazz = r.getClass();
        System.out.println(clazz);
    }

}