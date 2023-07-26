package dataStructures.day3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamEx {
    public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<>();
        hmap.put("1","Archisman");
        hmap.put("2","Rishav");
        hmap.put("3","Ritwik");
        hmap.put("4","Upalabdhi");

        List<String> list = hmap.entrySet().stream()
                .filter(k->k.getKey().startsWith("2"))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
