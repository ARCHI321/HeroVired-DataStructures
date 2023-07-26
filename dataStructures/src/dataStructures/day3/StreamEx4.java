package dataStructures.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,7,8);

        List<Integer> numbers1 = numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
        numbers.stream().filter(i->i%2==0)
                .collect(Collectors.toList());
//                .forEach(x-> System.out.println(x));
        int even
                = numbers.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (ans, i) -> ans + i);
        System.out.println("The even numbers are : "+ numbers1);
        System.out.println("Sum of the even numbers : " +even);
    }
}
