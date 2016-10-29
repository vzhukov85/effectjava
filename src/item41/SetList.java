package item41;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();

        for(int i=-3; i<3; ++i) {
            list.add(i);
            set.add(i);
        }

        for(int i=0; i<3; ++i) {
            list.remove(i);
            set.remove(i);
        }

        System.out.println(set + " " + list);
    }
}
