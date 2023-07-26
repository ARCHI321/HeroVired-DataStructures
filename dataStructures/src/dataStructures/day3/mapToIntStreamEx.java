package dataStructures.day3;

import java.util.Arrays;
import java.util.List;

public class mapToIntStreamEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,7,8);
        int sum = numbers.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
