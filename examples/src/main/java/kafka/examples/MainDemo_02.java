package kafka.examples;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class MainDemo_02 {

    public static void main(String[] args) {

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
