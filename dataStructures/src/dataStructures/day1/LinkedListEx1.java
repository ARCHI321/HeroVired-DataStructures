package dataStructures.day1;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("Java");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Jay");
        list1.add("Raj");
        list1.add("Keval");

        System.out.println(list1.stream().findFirst());


    }
}
