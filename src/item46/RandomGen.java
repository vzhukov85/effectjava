package item46;


import java.util.Random;

public class RandomGen {

    private static final Random rnd = new Random();

    public int random(int n) {
        return Math.abs(rnd.nextInt())% n;
    }
}
