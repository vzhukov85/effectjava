package item69;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownExample {
    public static void main(String[] args) throws Exception {
        final Runnable action = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        int coucurrent = 10;
        Executor executor = Executors.newFixedThreadPool(coucurrent);
        final CountDownLatch ready = new CountDownLatch(coucurrent);
        final CountDownLatch start = new CountDownLatch(1);
        final CountDownLatch done = new CountDownLatch(coucurrent);
        for(int i=0; i<coucurrent; ++i) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    ready.countDown();
                    try {
                        start.await();
                        action.run();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        done.countDown();
                    }
                }
            });
        }
        ready.await();
        long startTime = System.nanoTime();
        start.countDown();
        done.await();
        System.out.println(System.nanoTime() - startTime);
    }
}
