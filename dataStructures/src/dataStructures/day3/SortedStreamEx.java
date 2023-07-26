package dataStructures.day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStreamEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ritwik", "Archisman", "Rishav","Arani","Upalabdhi","Suvam","Souvik","Sanjana");
//        List<String> result
//                = names.stream()
//                .filter(s -> s.startsWith("S"))
//                .collect(Collectors.toList());
//
//        System.out.println(result);

//        List<String> show
//                = names.stream()
//                .filter(s -> s.startsWith("S"))
//                .sorted()
//                .collect(Collectors.toList());
        List<String> show
                = names.stream()
                .filter(s -> s.startsWith("S"))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(show);

    }
}
