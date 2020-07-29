package practise;

/**
 * @author fengyadong001
 * @date 2020/6/24 5:43 PM
 * @description 验证classloader
 */
public class Load {

    static {
        System.out.println("Load");
    }

    public static void main(String[] args) {
        System.out.println("start");
        System.out.println(Load.class.getClassLoader());
    }
}