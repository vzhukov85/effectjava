package item66;

import java.util.concurrent.TimeUnit;

public class StopThreadVolitole {

    private static volatile boolean threadStop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(!threadStop)
                    ++i;
            }
        });

        thread.start();
        TimeUnit.SECONDS.sleep(1);
        threadStop = true;
    }
}
