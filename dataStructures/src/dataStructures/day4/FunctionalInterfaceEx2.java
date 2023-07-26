package dataStructures.day4;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class FunctionalInterfaceEx2 {
    public static void main(String[] args) {
        FunctionalInterfaceEx ref = (i,j) -> i+j;
        int result = ref.find_sum(10,15);
        System.out.println("Sum of the two numbers = " +result);
    }
}
