package netWork.moreThread;

public class Box {
    private int milk;
    private boolean state = false;
    public synchronized void put(int milk) {
        if(state){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        //如果没有就生产牛奶
        this.milk = milk;
        System.out.println(milk);
        state = true;
        //唤醒线程
        notifyAll();
    }
    public synchronized void get(){
        if(!state){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(this.milk);
        state = false;
        notifyAll();
    }
}
