package item66;

import java.util.concurrent.TimeUnit;

public class StopThreadSynchronized {

    private static boolean threadStop = false;

    public static synchronized boolean isThreadStop() {
        return threadStop;
    }

    public static synchronized void setThreadStop() {
        threadStop = true;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(!isThreadStop())
                    ++i;
            }
        });

        thread.start();
        TimeUnit.SECONDS.sleep(1);
        setThreadStop();
    }
}
