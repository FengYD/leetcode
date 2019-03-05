package java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author fengyadong
 * @date 2019/3/6 0:21
 * @description
 */
public class Lamda {

    public static void main(String[] args) {
        Lamda lamda = new Lamda();
        lamda.example1();
    }

    public void example1(){
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple("red", 100));
        appleList.add(new Apple("red", 110));
        appleList.add(new Apple("red", 120));
        appleList.add(new Apple("red", 130));
        appleList.add(new Apple("red", 140));
        appleList.add(new Apple("red", 150));
        appleList.add(new Apple("green", 101));
        appleList.add(new Apple("green", 111));
        appleList.add(new Apple("green", 121));
        appleList.add(new Apple("green", 131));
        appleList.add(new Apple("green", 141));
        appleList.add(new Apple("green", 151));

        List<Apple> traditionalSortList = new ArrayList<>();
        traditionalSortList.addAll(appleList);

        List<Apple> modernSortList = new ArrayList<>();
        modernSortList.addAll(appleList);

        System.out.println(appleList);
        System.out.println(traditionalSortList);
        traditionalSort(traditionalSortList);
        System.out.println(traditionalSortList);
        System.out.println(modernSortList);
        modernSortList = modernSort(modernSortList);
        System.out.println(modernSortList);

    }

    public List<Apple> traditionalSort(List<Apple> appleList){
        Collections.sort(appleList, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        return appleList;
    }

    public List<Apple> modernSort(List<Apple> appleList){
        return appleList.stream().sorted(Comparator.comparing(Apple::getWeight)).collect(Collectors.toList());
    }

}
