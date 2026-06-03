package test5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AverageOfEveryXelementSlidingWindow {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(4,8,15,16,23,42);

        List<Double> list1 = IntStream.range(0, list.size() - 2)
                .mapToObj(i -> (list.get(i) + list.get(i + 1) + list.get(i + 2)) / 3.0)
                .toList();

//        System.out.println(list1);

        int window=3;

        List<Double> list2 = IntStream.range(0, list.size() - (window - 1))
                .mapToObj(j -> list.subList(j, j + window))
                .map(w -> w.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0))
                .toList();

        System.out.println(list2);


    }
}
