package netWork.moreThread;

public class Product implements Runnable{
    private Box b;
    public Product(Box b){
        this.b = b;
    }
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            b.put(i);
        }
    }
}
