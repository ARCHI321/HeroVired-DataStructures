package dataStructures.day4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTwo {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6);

        List<List<Integer>> allList = Arrays.asList(list1,list2,list3);
        List<Integer> newList = allList.stream().flatMap(li->li.stream()).collect(Collectors.toList());
        System.out.println(newList);

        if(newList.isEmpty() && (newList.get(0).equals(null))){
            System.out.println("hello");
        }

        list1.stream().peek(System.out::println).collect(Collectors.toList());

        List<Integer> list4 = list1.stream().limit(3).collect(Collectors.toList());
        System.out.println(list4);

        Stream<String> stringStream = Stream.of("Java", "Python" );
        boolean result = stringStream.anyMatch(s->s.contains("aM"));
        System.out.println("Match ex : " + result);

//        int i= list1.stream().reduce(Integer::sum).get();
//        int j= list1.stream().reduce(Integer::max).get();

        Optional<Integer> i = list1.stream().reduce(Integer::sum);
        Optional<Integer> j = list1.stream().reduce(Integer::max);
        System.out.println("Sum of list1 : " + i);
        System.out.println("Max of list1 : " + j);

    }
}
