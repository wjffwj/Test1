package 创建线程;


public class MyRunnableTest implements Runnable {
    private int i;
    @Override
    /**
     * 重写run方法,该方法同样是该线程的线程执行体
     */
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            if (i == 20) {
                MyRunnableTest runnable = new MyRunnableTest();
                //该Thread对象才是真正的线程对象.
                new Thread(runnable, "新线程-1").start();
                new Thread(runnable, "新线程-2").start();
            }
        }
    }
}


