package test5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Top3Word {
    public static void main(String[] args) {

        String s="Java is great. Java is object oriented. Java streams are powerful, and Java is fun, are";
        Map<String, Long> collect = Arrays.stream(s.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        List<Map.Entry<String, Long>> list = collect.entrySet()
                .stream()
                .sorted(Comparator.comparing((Map.Entry<String, Long> entry) -> entry.getValue()).reversed())
                .limit(3)
                .toList();
        System.out.println(list);
    }
}
