package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Prac4 {
    public static void main(String[] args) {

        List<Integer> li= Arrays.asList(1,2,3,4,5,6);

        Optional<Integer> max = li.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo);
        max.ifPresent(System.out::println);


        List<Integer> list = li.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();

        System.out.println(list);
    }
}
