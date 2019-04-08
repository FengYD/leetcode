package multiThread;

/**
 * @author fengyadong
 * @date 2019/4/8 23:37
 * @description
 */
public class SharedDataThread extends Thread {
    public int data = 0;

    @Override
    public void run(){
        super.run();
        data++;
        System.out.println(currentThread().getName() + ": data = " + this.data);
    }

    /**线程安全问题*/
    public static void main(String[] args) {
        SharedDataThread thread = new SharedDataThread();
        Thread thread1 = new Thread(thread, "1");
        Thread thread2 = new Thread(thread, "2");
        Thread thread3 = new Thread(thread, "3");
        Thread thread4 = new Thread(thread, "4");
        Thread thread5 = new Thread(thread, "5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }

}
