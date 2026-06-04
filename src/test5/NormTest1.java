package test5;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class NormTest1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Double> list1 = IntStream.range(0, list.size() - 2)
                .mapToObj(i -> (list.get(i) + list.get(i + 1) + list.get(i + 2)) / 3.0)
                .toList();

        System.out.println(list1);

       int window=3;

        List<Double> list2 = IntStream.range(0, list.size() - (window - 1))
                .mapToObj(i -> list.subList(i, i + window))
                .map(w -> w.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0))
                .toList();

        System.out.println(list2);
    }
}
