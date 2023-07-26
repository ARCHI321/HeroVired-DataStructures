package dataStructures.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,7,8);
        numbers.stream().filter(i->i%2==0)
                .map(k->k*k)
                .collect(Collectors.toList())
//                .forEach(x-> System.out.println(x));
                .forEach(System.out::println);
    }
}
