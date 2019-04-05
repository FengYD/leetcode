package java8.appleFormat;

import java8.Apple;

/**
 * @author fengyadong
 * @date 2019/3/8 22:03
 * @description
 */
public class AppleFormaterPrintId implements AppleFormater {

    @Override
    public String acceptApple(Apple apple){
        return apple.getId().toString();
    }
}
