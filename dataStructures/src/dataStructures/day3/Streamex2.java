package dataStructures.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamex2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);
    }
}
