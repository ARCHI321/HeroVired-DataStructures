package dataStructures.day2;

import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        //sorting in ascending order by default
        TreeMap<Integer , String> treeMap = new TreeMap<>();
        treeMap.put(1,"AA");
        treeMap.put(3,"CC");
        treeMap.put(2,"Bb");

        System.out.println(treeMap);
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
    }
}
