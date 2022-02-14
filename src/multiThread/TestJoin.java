package multiThread;

/**
 * @author fengyadong
 * @Description: <br/>
 * @Date: 2022-02-12 10:10<br/>
 */
public class TestJoin extends Thread {

    public TestJoin(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("join 开始");
        try {
            sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println("join 结束");
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin join = new TestJoin("join");
        join.start();
        //join.join();
        System.out.println("main 结束");
    }
}
