package dataStructures.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctStreamEx2 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,1,3,3,5,6,7,8,9,10,10,23,34,34,56,67,78,60);
        long count = number.stream().distinct().count();
        System.out.println("Count of distinct values : " + count);
    }
}
