package item36;

import java.util.HashSet;
import java.util.Set;

public class Bigram {
    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    //@Override
    public boolean equals(Bigram o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bigram bigram = o;

        if (first != bigram.first) return false;
        return second == bigram.second;
    }

    @Override
    public int hashCode() {
        int result = (int) first;
        result = 31 * result + (int) second;
        return result;
    }

    public static void main(String[] args) {
        Set<Bigram> bigrams = new HashSet<>();
        for(int i=0; i< 10; ++i) {
            for(char ch='a'; ch<='z'; ++ch) {
                bigrams.add(new Bigram(ch, ch));
            }
        }
        System.out.println(bigrams.size());
    }
}
