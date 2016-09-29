package item12;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class WordList {
    public static void main(String[] args) {
        Set s = new TreeSet<String>();
        s.addAll(Arrays.asList(args));
        System.out.println(s);
    }

}
