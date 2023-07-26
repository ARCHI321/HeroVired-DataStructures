package dataStructures.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeStreamEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
        System.out.println(numbers.stream()
//                .filter(PrimeStreamEx::isPrime)
                .filter(k->isPrime(k))
                .collect(Collectors.toList()));
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
