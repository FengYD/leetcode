package multiThread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengyadong
 * @date 2019/4/8 23:11
 * @description
 */
public class ExtendThread extends Thread {

    @Override
    public void run(){
        super.run();
        System.out.println("ExtendThread" + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        List<ExtendThread> threadList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            ExtendThread thread = new ExtendThread();
            threadList.add(thread);
        }

        for(ExtendThread thread : threadList){
            thread.run();
        }
        System.out.println("thread end");
    }
}
