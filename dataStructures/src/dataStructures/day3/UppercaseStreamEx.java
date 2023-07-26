package dataStructures.day3;

import java.util.Arrays;
import java.util.List;

public class UppercaseStreamEx {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList(
//                "Ritwik", "Archisman", "Rishav","Arani","Upalabdhi","Suvam","Souvik","Sanjana");
//        names.stream().map(k->k.toUpperCase()).forEach(k-> System.out.println(k));
        List<String> names = Arrays.asList(
                "ritwik", "archisman", "rishav","arani","upalabdhi","suvam","souvik","sanjana");
        names.stream().map(k->k.replace(k.charAt(0) , (char) ((int)k.charAt(0)-32))).forEach(k-> System.out.println(k));
    }
}
