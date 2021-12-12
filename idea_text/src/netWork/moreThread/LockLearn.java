package netWork.moreThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockLearn implements Runnable {
    private Object obj = new Object();
    private Lock lock = new ReentrantLock();
    //run方法是用来封装被线程执行的代码
    @Override
    public void run() {
        try{
            //启动锁
            lock.lock();
            for (int i=0;i<10;i++){
                System.out.println(i);
            }
        }finally {
            //释放锁
            lock.unlock();
        }

    }
}

