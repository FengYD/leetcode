package java8.practise;

import java8.Apple;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Arrays;

/**
 * @author fengyadong001
 * @date 2019/9/3 12:18 PM
 * @description java内省类
 */
public class TestIntrospector {

    public static void main(String[] args) throws Exception {
        Apple apple = new Apple();
        apple.setId(1);
        apple.setColor("red");
        apple.setWeight(300);
        BeanInfo beanInfo = Introspector.getBeanInfo(apple.getClass());
        PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
        Arrays.stream(descriptors).forEach(
                d ->{
                    try {
                        System.out.println(d.getName());
                        System.out.println(d.getReadMethod().invoke(apple));
                    } catch (Exception e){
                        e.printStackTrace();
                    }

                }
        );
    }
}