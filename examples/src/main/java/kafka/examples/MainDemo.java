package kafka.examples;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;


public class MainDemo {

    public static void main(String[] args) {

//        AtomicInteger a = new AtomicInteger(12);
//        System.out.println(a.compareAndSet(14, 13));
//        System.out.println(a);
        final AtomicLong currentThread = new AtomicLong(2L);
        long threadId = Thread.currentThread().getId();
        if (threadId != currentThread.get() && !currentThread.compareAndSet(1L, 2)) {
            System.out.println("====================" + currentThread.get());
        }
    }
}
