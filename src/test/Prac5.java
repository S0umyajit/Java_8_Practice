package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Comparator;

public class Prac5 {
    public static void main(String[] args) {

        List<Integer> li= Arrays.asList(1,10,18,19,123,24);
        Optional<Integer> firstNum=li.stream()
                .filter(n->n>10)
                .sorted(Comparator.reverseOrder())
                .findFirst();
        firstNum.ifPresent(System.out::println);
    }
}
