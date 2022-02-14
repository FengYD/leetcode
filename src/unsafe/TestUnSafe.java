package unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author fengyadong
 * @Description: <br/>
 * @Date: 2022-02-14 12:57<br/>
 */
public class TestUnSafe {

    private static Unsafe unsafe;

    private int a = 1;
    private long b = 2;

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
        } catch (Exception e) {
            throw new Error();
        }
    }

    public static Unsafe getUnsafe(){
        return unsafe;
    }


    public static void main(String[] args) {

    }
}
