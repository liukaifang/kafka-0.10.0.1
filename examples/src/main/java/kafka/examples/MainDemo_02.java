package kafka.examples;

import java.util.concurrent.ArrayBlockingQueue;
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
}
