package 不可重入锁;

import java.util.concurrent.atomic.AtomicReference;
//代码也比较简单，使用原子引用来存放线程，同一线程两次调用lock()方法，
// 如果不执行unlock()释放锁的话，第二次调用自旋的时候就会产生死锁，这个锁就不是可重入的，
//而实际上同一个线程不必每次都去释放锁再来获取锁，这样的调度切换是很耗资源的。稍微改一下，把它变成一个可重入锁：
public class UnReetrantLock {
    private AtomicReference<Thread> owner=new AtomicReference<>();
    public void lock(){
        Thread current=Thread.currentThread();
        for(;;){
            if(!owner.compareAndSet(null,current)){
                return ;
            }
        }
    }
    public void unlock(){
        Thread current=Thread.currentThread();
        owner.compareAndSet(current,null);
    }


}
