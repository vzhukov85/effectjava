package item25;

import java.util.ArrayList;
import java.util.List;

public class UnsafeArray {
    public static void main(String[] args) {
        Object[] objectArray = new Long[1];
        objectArray[0] = "error ";

        List<Long> listArray = new ArrayList<Long>();
        //listArray.add("typesafe");
    }

}
