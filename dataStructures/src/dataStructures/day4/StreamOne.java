package dataStructures.day4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOne {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6);

        List<List<Integer>> allList = Arrays.asList(list1,list2,list3);
        List<Integer> newList = allList.stream().flatMap(li->li.stream()).collect(Collectors.toList());
        System.out.println(newList);

    }
}
