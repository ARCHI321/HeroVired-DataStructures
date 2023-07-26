package dataStructures.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListEx1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("lol");
        strings.add("cat");
        for (String s : strings) {
            System.out.println(s);
        }
        Collections.sort(strings);
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
