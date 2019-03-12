package LearnAQS;

import java.util.Collection;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock2 extends ReentrantLock {
    private static final long serialVersionUID = 1773716895097002072L;

    @Override
    protected Collection<Thread> getQueuedThreads() {
        return super.getQueuedThreads();
    }


}
