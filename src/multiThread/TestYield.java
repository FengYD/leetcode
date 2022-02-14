package multiThread;

/**
 * @author fengyadong
 * @Description: <br/>
 * @Date: 2022-02-11 15:30<br/>
 */
public class TestYield extends Thread {

    public TestYield(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("" + this.getName() + "-----" + i);
            if (i == 2) {
                this.yield();
            }
        }
    }

    public static void main(String[] args) {
        TestYield yt1 = new TestYield("张三");
        TestYield yt2 = new TestYield("李四");
        yt1.start();
        yt2.start();
    }
}