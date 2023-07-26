package dataStructures.day1;

import java.util.*;

public class TreeSetEx1 {
    public static void main(String[] args) {
        //TreeSet maintains default order - ascending order
        TreeSet<Integer> set = new TreeSet<>();
//        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(23);
        set.add(2);
        System.out.println("TreeSet(setOfNumbers) : "
                + set);

        Iterator<Integer> iterator
                = set.descendingIterator();

        // Iterating TreeSet
        System.out.print("TreeSet in reverse order : ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        //HashSet vs TreeSet

    }
}
