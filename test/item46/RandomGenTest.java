package item46;


import org.junit.Test;

public class RandomGenTest {
    private RandomGen subj = new RandomGen();

    @Test
    public void testRandom() {
        int n = 2* (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i=0; i < 1000000; ++i) {
            if (subj.random(n) < n/2)
                ++low;
        }
        System.out.println(low);
    }
}