package netWork.moreThread;

public class ThreadLearn extends Thread{
    private Object obj = new Object();
    //run方法是用来封装被线程执行的代码
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            //使用synchronized，下面的这部分代码在多线程中同一时间只会执行一个
//            synchronized (obj) {
            if(i%2==0){
                synchronized (this) {
                    System.out.println(i);
                }
            }else{
                methodSync();
            }
        }
    }
    private synchronized void methodSync(){
        //同步锁方法的对象是this
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
