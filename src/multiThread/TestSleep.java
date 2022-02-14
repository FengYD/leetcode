package multiThread;

/**
 * @author fengyadong
 * @Description: <br/>
 * @Date: 2022-02-11 17:58<br/>
 */
public class TestSleep extends Thread {

    public TestSleep(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            sleep(2000);
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState().name());
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestSleep th = new TestSleep("test");
        System.out.println(Thread.currentThread().getName() + " " + th.getState().name());
        th.start();
        sleep(1000);
        System.out.println(Thread.currentThread().getName() + " " + th.getState().name());
    }
}
