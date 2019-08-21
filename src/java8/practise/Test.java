package java8.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengyadong001
 * @date 2019/7/30 2:46 PM
 * @description
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(String s : list){
            try {
                System.out.println(s);
            } catch (NullPointerException npe){
                System.out.println("for循环引用异常");
                continue;
            }
        }
        System.out.println("for循环引用");

        list.forEach( s -> {
            System.out.println(s);
        });
    }

}