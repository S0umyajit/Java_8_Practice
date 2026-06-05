package test3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test11 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,10,11);

        List<Integer> list1 = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(list1);


        List<Integer> list2 = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();

        System.out.println(list2);

        Optional<Integer> first = list.stream()
                .filter(n -> n > 10)
                .sorted(Comparator.comparing(Integer::intValue))
                .findFirst();
        System.out.println(first);

        long count = list.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println(count);

        Integer reduce = list.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(reduce);

        Optional<Integer> max = list.stream()
                .max(Comparator.comparing(Integer::intValue));
        System.out.println(max);

        int sum = list
                .stream().filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
