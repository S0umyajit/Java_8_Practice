package test3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SSS {
    public static void main(String[] args) {
        List<Integer>ll= Arrays.asList(12,11,23,45,9,89,007);

        Optional<Integer> first = ll.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(first);

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> list = listOfLists.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(list);
    }
}
