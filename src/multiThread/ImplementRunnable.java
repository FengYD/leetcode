package multiThread;

/**
 * @author fengyadong
 * @date 2019/4/8 23:29
 * @description
 */
public class ImplementRunnable implements Runnable {

    @Override
    public void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        Runnable run = new ImplementRunnable();
        Thread thread = new Thread(run);
        thread.start();
        System.out.println("run");
    }
}
