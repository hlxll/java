package netWork.moreThread;

import java.util.Properties;

public class Index {
    public static void main(String[] args) {
        f_readWrite();

    }

    private static void f_readWrite() {
        //生成者消费者
        Box b = new Box();
        Product p = new Product(b);
        Customer c = new Customer(b);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
        //想要达到的效果是生产者制作一瓶牛奶，消费者得到一瓶牛奶

    }

    private static void f_lock() {
        //lock线程，使用启动线程和停止线程进行同步处理
        LockLearn Ll = new LockLearn();
    }

    private static void f_sync() {
        ThreadLearn tl = new ThreadLearn();
        ThreadLearn tl2 = new ThreadLearn();
        //thread实现多线程，使用start执行该类中多线程的方法
        //run方法直接执行，相当于普通方法调用。start启动线程，调用该多线程的run方法
        //多线程的设置和获取线程优先级
        System.out.println(tl.getPriority());
        System.out.println(tl2.getPriority());
        //线程优先级1-10，默认是5
        tl.setPriority(2);
        //线程控制
        //sleep使当前正在执行的线程停留指定毫秒,stop等待这个线程死亡才能执行其他线程。setDaemon将线程标记为守护线程，当全部线程都
        //是守护线程，java虚拟机退出
        tl.start();
        tl2.start();


        StringBuffer sb = new StringBuffer();
    }


}
