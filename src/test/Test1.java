package test;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        String s="SWISS";

        Map<Character, Long> collect = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<Map.Entry<Character, Long>> max = collect.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        System.out.println(max);
    }
}
