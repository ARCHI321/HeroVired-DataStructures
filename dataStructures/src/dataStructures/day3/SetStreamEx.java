package dataStructures.day3;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetStreamEx {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        set.add(4);
        set.add(3);
        set.add(5);
        set.add(6);

        //set.stream().filter(i->i%2==0).forEach(j->{System.out.println(j);});
        set.stream().filter(i->i%2==0).forEach(j->{set1.add(j);});
        System.out.println(set1);


    }
}
