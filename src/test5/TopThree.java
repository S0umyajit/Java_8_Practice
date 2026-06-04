package test5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TopThree {
    public static void main(String[] args) {
        String s="Java is great. Java is object oriented. Java streams are are powerful, and Java is fun";

        Map<String, Long> frequency = Arrays.stream(s.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));



        List<Map.Entry<String, Long>> sorted = frequency.entrySet()
                .stream()
                .sorted(Comparator.comparing((Map.Entry<String, Long> entry) -> entry.getValue()).reversed())
                .toList();

        System.out.println(frequency);
        System.out.println(sorted);
        List<Long> topFreq = sorted.stream()
                .map(Map.Entry::getValue)
                .distinct()
                .limit(3)
                .toList();
        System.out.println(topFreq);

        List<Map.Entry<String, Long>> list = sorted.stream()
                .filter(e -> topFreq.contains(e.getValue()))
                .toList();
        System.out.println(list);
    }
}
