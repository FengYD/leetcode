package jvm;

/**
 * @author fengyadong
 * @Description: 测试 GC 是否用了引用计数法, 代码来自深入理解 Java 虚拟机 | vm options: -Xmx50m -Xms50m -XX:+PrintGC
 * @Date: 2022-02-12 10:55<br/>
 */
public class TestReferenceCountGC {

    public Object instance = null;

    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];


    public static void main(String[] args) {
        TestReferenceCountGC objA = new TestReferenceCountGC();
        TestReferenceCountGC objB = new TestReferenceCountGC();

        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }

}
