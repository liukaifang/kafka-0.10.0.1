package kafka.examples;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class MainDemo {

    @Test
    public void test0() {
 //        AtomicInteger a = new AtomicInteger(12);
//        System.out.println(a.compareAndSet(14, 13));
//        System.out.println(a);
        final AtomicLong currentThread = new AtomicLong(2L);
        long threadId = Thread.currentThread().getId();
        if (threadId != currentThread.get() && !currentThread.compareAndSet(1L, 2)) {
            System.out.println("====================" + currentThread.get());
        }
    }

    @Test
    public void testQueue() {
        ArrayBlockingQueue queue = new ArrayBlockingQueue<String>(2);
        queue.add("a");
        queue.add("b");
        queue.add("c");
        try {
            queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(queue.toArray());
    }

    @Test
    public void test() {
        ConcurrentHashMap<Object, Object> map = new ConcurrentHashMap<>();
        map.put("a", 123);
        System.out.println(map.putIfAbsent("a", 22));
        System.out.println(map.putIfAbsent("b", 22));
    }

}
