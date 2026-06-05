package test3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Test22 {
    public static void main(String[] args) {

        List<Integer>i= Arrays.asList(1,2,1,2,1,3,1,2,4,5,6,9);

        i.stream()
                .distinct()
                .forEach(System.out::println);

        OptionalDouble average = i.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(average);


        List<Integer> list = i.stream()
                .sorted()
                .toList();
        System.out.println(list);

        Stream<Integer> sorted = i.stream()
                .sorted(Comparator.reverseOrder());
        System.out.println(sorted);


    }
}
