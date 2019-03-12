package 线程池;

import 创建线程.FirstThreadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=0;i<100;i++){
            executorService.execute(new FirstThreadTest());
        }
    }
}
