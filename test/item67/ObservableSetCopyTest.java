package item67;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ObservableSetCopyTest {

    private ObservableSetCopy<Integer> subj;

    @Before
    public void setUp() {
        subj = new ObservableSetCopy<>(new HashSet<>());
    }

    @Test
    public void testAdd() throws Exception {

        subj.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(Observable<Integer> o, Integer integer) {
                System.out.println(integer);
            }
        });

        for(int i=0; i<100; ++i)
            subj.add(i);
    }

    @Test
    public void testAdd_exception() throws Exception {

        subj.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(Observable<Integer> o, Integer integer) {
                System.out.println(integer);
                if (integer == 23) {
                    o.removeObserver(this);
                }
            }
        });

        for(int i=0; i<100; ++i)
            subj.add(i);
    }

    @Test
    public void testAddDeadLock() throws Exception {

        subj.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(final Observable<Integer> o, Integer integer) {
                System.out.println(integer);
                final SetObserver<Integer> observer = this;
                if (integer == 23) {
                    ExecutorService service = Executors.newSingleThreadExecutor();
                    try {
                        service.submit(new Runnable() {
                            @Override
                            public void run() {
                                o.removeObserver(observer);
                            }
                        }).get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    } finally {
                        service.shutdown();
                    }
                }
            }
        });

        for(int i=0; i<100; ++i)
            subj.add(i);
    }
}