package leet.tools;

/**
 * @author fengyadong
 * @date 2019/4/21 21:55
 * @description
 */
public class StringTest {
    public static void main(String[] args) {
        StringTest test = new StringTest();
        test.stringFormatTest();
        test.stringTest();
        test.stringFormatTest();
    }

    public void stringFormatTest(){
        long start = System.nanoTime();
        for(int i = 0; i < 152; i++){
            String s = String.format("%dA%dB", i, i);
        }
        System.out.println("String.format:" + (System.nanoTime() - start));
    }

    public void stringTest(){
        long start = System.nanoTime();
        for(int i = 0; i < 152; i++){
            String s = i + "A" + i + "B";
        }
        System.out.println("string:" + (System.nanoTime() - start));
    }
}
