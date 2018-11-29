package 创建线程;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<List<Integer>> {

    @Override
    public List<Integer> call() throws Exception {
        List<Integer> list=new ArrayList<>();
        int i;
        for(i=0;i<100;i++){
            list.add(i);
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
        return list;
    }
    public static void main(String[] args) {
        MyCallable callable=new MyCallable();
        //使用FutureTask类包装Callable对象.
        FutureTask<List<Integer>> task=new FutureTask<>(callable);
        for(int i=0;i<100;i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
            if(i==20){
                new Thread(task).start();
            }
        }
        try {
            System.out.println(task.get().toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
