package LearnAQS;

import java.util.concurrent.locks.Lock;

public class Job implements Runnable {
    private Lock lock;

    public Job(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            lock.lock();
            try {
                System.out.println("Lock By:"+Thread.currentThread().getName()+
                        "And "+((ReentrantLock2)lock).getQueuedThreads()+"waits");
            }finally {
                lock.unlock();
            }
        }
    }
}
