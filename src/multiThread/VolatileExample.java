package multiThread;

/**
 * @author fengyadong
 * @date 2019/4/8 22:40
 * @description
 */
public class VolatileExample {

    private volatile int inc = 0;

    public void increase(){
        inc++;
    }

    public int getInc(){
        return inc;
    }

    /**结果并不总是 100000*/
    public static void main(String[] args) {

        final VolatileExample example = new VolatileExample();

        for(int t = 0; t < 1000; t++){
            new Thread() {
                @Override
                public void run() {
                    for (int b = 0; b < 100; b++){
                        example.increase();
                    }
                }
            }.start();
        }

        while (Thread.activeCount() > 1){
            Thread.yield();
        }

        System.out.println(example.getInc());

    }
}
