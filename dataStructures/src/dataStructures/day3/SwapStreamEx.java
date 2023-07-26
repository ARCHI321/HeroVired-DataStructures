package dataStructures.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SwapStreamEx {
    public static void main(String[] args) {
        List<List<Integer>> numbers = new ArrayList<>();
        numbers.add(Arrays.asList(1,2));
        numbers.add(Arrays.asList(3,4));
        numbers.add(Arrays.asList(5,6));
;
        List<List<Integer>> swappedNumbers = numbers.stream()
                                                    .map(a->swap(a))
                                                    .collect(Collectors.toList());;
        System.out.println(swappedNumbers);
    }
    public static List<Integer> swap(List<Integer> a2){
        int c;
        int a = a2.get(0);
        int b = a2.get(1);
        c=a;
        a=b;
        b=c;

        List<Integer> a1 = Arrays.asList(a,b);
        return  a1;
    }
}
