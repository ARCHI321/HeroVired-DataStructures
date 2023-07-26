package dataStructures.day1;

import java.util.*;
public class ListEx1 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1, "Archisman");
        Employee emp2 = new Employee(2, "Archisman");

        list.add(emp1);
        list.add(emp2);

        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "hello");
        map.put("2", "hello");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + "-" + m.getValue());
        }

    }
}