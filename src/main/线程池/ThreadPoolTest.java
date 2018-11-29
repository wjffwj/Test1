package 线程池;

import 创建线程.FirstThreadTest;
import 创建线程.MyRunnableTest;

import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
        BlockingQueue<Runnable> workQueue=new ArrayBlockingQueue<Runnable>(200);
        ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(200,300,100,TimeUnit.SECONDS,workQueue);

        threadPoolExecutor.setRejectedExecutionHandler(callerRunsPolicy);
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(new MyRunnableTest());
        }
    }


}
