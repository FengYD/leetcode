package multiThread;

import java.util.concurrent.*;

/**
 * @author fengyadong
 * @date 2022/6/24 11:06
 * @Description
 */
public class FutureTest {


//    ExecutorService executor = Executors.newSingleThreadExecutor();
//
//    public Future<Integer> calculate(Integer input) {
//        return executor.submit(() -> {
//            System.out.println("Calculating  "+ input);
//            Thread.sleep(1000);
//            return input * input;
//        });
//    }



//    public static void main(String[] args) {
//        FutureTest futureTest = new FutureTest();
//        Future<Integer> future1 = futureTest.calculate(1);
//        try {
//            Integer r = future1.get(2, TimeUnit.SECONDS);
//            System.out.println("future1  " + r);
//        } catch (Exception e) {
//            System.out.printf("error  ");
//            System.out.println(e.getMessage());
//        }
//
//        Future<Integer> future2 = futureTest.calculate(2);
//        try {
//            Integer r = future2.get(4, TimeUnit.SECONDS);
//            System.out.println("future2  " + r);
//        } catch (Exception e) {
//            System.out.printf("error  ");
//            System.out.println(e.getMessage());
//        }
//        System.out.println("end");
//    }

    public FutureTask<Integer> cal(Integer input){
        return new FutureTask<>(
                () -> input * input
        );
    }


    public static void main(String[] args) {
        FutureTest futureTest = new FutureTest();
        FutureTask<Integer> f1 = futureTest.cal(1);
        FutureTask<Integer> f2 = futureTest.cal(2);
        f1.run();
        try {
            Integer r = f1.get(2, TimeUnit.SECONDS);
            System.out.println("future1  " + r);
        } catch (Exception e) {
            System.out.printf("error  ");
            System.out.println(e.getMessage());
        }
        f2.run();
        try {
            Integer r = f2.get(4, TimeUnit.SECONDS);
            System.out.println("future2  " + r);
        } catch (Exception e) {
            System.out.printf("error  ");
            System.out.println(e.getMessage());
        }

    }
}
