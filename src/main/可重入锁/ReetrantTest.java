package 可重入锁;

public class ReetrantTest implements Runnable {
    public synchronized void get(){
        System.out.println("get"+Thread.currentThread().getName());
        set();
    }

    public synchronized void set(){
        System.out.println("set"+ Thread.currentThread().getName());
    }

    @Override
    public void run() {
        get();
    }

    public static void main(String[] args) {
        ReetrantTest rt=new ReetrantTest();
        for(;;){
            new Thread(rt).start();
        }
    }
}
