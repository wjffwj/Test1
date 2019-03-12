package threadlocal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ThreadLocalTest {

    public static void main(String[] args) throws Exception {
        ThreadLocal<Map> threadLocal = new ThreadLocal<>();
        Map map = new HashMap();
        map.put("a", "a");
        map.put("b", "a");

        threadLocal.set(map);
        Map map1 = threadLocal.get();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadLocal<Map> integerThreadLocal = new ThreadLocal<>();
                integerThreadLocal.set(map1);
                System.out.println(integerThreadLocal.get());
            }
        }).start();
        System.out.println(1);
    }
}
