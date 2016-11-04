package item66;


import java.util.concurrent.TimeUnit;

public class StopThreadBad {

    private static boolean stopThread = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(!stopThread)
                    ++i;
            }
        });

        thread.start();
        TimeUnit.SECONDS.sleep(1);

        stopThread = true;
    }
}
