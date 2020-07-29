package multiThread;

/**
 * @author fengyadong
 * @Description: <br/>
 * @Date: 2020-07-25 13:02<br/>
 */
public class ThreadOrder extends Thread {

    public int order;

    public ThreadOrder(int order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("thread" + order + " start.");
    }

    /**
     * 线程启动之后，执行的顺序是随机的
     */
    public static void main(String[] args) {
        ThreadOrder thread1 = new ThreadOrder(1);
        ThreadOrder thread2 = new ThreadOrder(2);
        ThreadOrder thread3 = new ThreadOrder(3);
        ThreadOrder thread4 = new ThreadOrder(4);
        ThreadOrder thread5 = new ThreadOrder(5);
        ThreadOrder thread6 = new ThreadOrder(6);
        ThreadOrder thread7 = new ThreadOrder(7);
        ThreadOrder thread8 = new ThreadOrder(8);
        ThreadOrder thread9 = new ThreadOrder(9);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
    }
}
