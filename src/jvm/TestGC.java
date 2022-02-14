package jvm;

import sun.misc.Unsafe;
import unsafe.TestUnSafe;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fengyadong
 * @Description: vm options: -Xmx30m -Xms30m -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+PrintGCTimeStamps
 * @Date: 2022-02-14 10:12<br/>
 */
public class TestGC {

    // young 10M     8M:1M:1M
    // old 20M
    public final int _1MB = 1024 * 1024;

    public byte[] bigSize = new byte[2 * _1MB];


    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.getProperty("java.version"));
        List<TestGC> list = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            list.add(new TestGC());
            System.out.println(i);
        }

        System.out.println("young GC");
        list.add(new TestGC());
        System.out.println(1);
        for (int i = 2; i <= 3; i++) {
            list.add(new TestGC());
            System.out.println(i);
        }
        System.out.println("young GC");
        list.add(new TestGC());
        System.out.println(1);
        for (int i = 2; i <= 3; i++) {
            list.add(new TestGC());
            System.out.println(i);
        }
        System.out.println("young GC");
        list.add(new TestGC());
        System.out.println("young GC");
        System.out.println("full GC");
        list.add(new TestGC());
    }
}
