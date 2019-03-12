package LearnAQS;

import java.util.concurrent.locks.Lock;

public class ReentrantLockTest {
    private static final Lock unfairLock=new ReentrantLock2();

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Thread thread=new Thread(new Job(unfairLock));
            thread.start();

        }
    }
}
