package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Prac3 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,9,5,6,7);

        List<Integer> list1 = list.stream()
                .map(n -> n * n)
                .toList();
        System.out.println(list1);


        List<Integer> list2 = list
                .stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .toList();

        Optional<Integer> min = list.stream()
                .min(Comparator.comparing(Integer::intValue));
        System.out.println(min);


        Optional<Integer> max = list.stream()
                .max((a, b) -> a.compareTo(b));
        System.out.println(max);

        Integer i = list.stream()
                .min(Integer::compareTo)
                .orElseGet(() -> -1);

        System.out.println(i);


        List<Integer> list3 = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(list3);


       List<Integer>rev= list.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
               .toList();
        System.out.println(rev);

    }
}
