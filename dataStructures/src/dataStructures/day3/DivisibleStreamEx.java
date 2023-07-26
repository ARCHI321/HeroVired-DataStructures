package dataStructures.day3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class DivisibleStreamEx {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,23,34,45,56,67,78,60);
        number.stream().filter(k->k%3==0 && k%5==0).forEach(System.out::println);


    }
}
