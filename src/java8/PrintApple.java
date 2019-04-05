package java8;

import java8.appleFormat.AppleFormater;

import java.util.List;

/**
 * @author fengyadong
 * @date 2019/3/8 21:58
 * @description
 */
public class PrintApple {

    public static void printApple(List<Apple> appleList, AppleFormater appleFormater){
        for (Apple apple : appleList) {
            String output = appleFormater.acceptApple(apple);
            System.out.println(output);
        }
    }

}
