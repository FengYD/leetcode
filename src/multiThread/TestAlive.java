package multiThread;

/**
 * @author fengyadong
 * @Description: <br/>
 * @Date: 2022-02-11 17:30<br/>
 */
public class TestAlive extends Thread {

    public TestAlive(String name) {
        super(name);
    }

    @Override
    public void run() {}

    public static void main(String[] args) throws InterruptedException {
        TestAlive th = new TestAlive("thread is alive :");
        System.out.println(th.getName() + th.isAlive() + "|" + th.getState().name());
        th.start();
        System.out.println(th.getName() + th.isAlive() + "|" + th.getState().name());
        Thread.sleep(100);
        System.out.println(th.getName() + th.isAlive() + "|" + th.getState().name());
    }
}
