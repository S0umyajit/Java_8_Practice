package test4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqChar {
    public static void main(String[] args) {
        String s="Banana";
        Optional<Map.Entry<Character, Long>> max = s.chars()
                .mapToObj(a -> (char) a)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        System.out.println(max);
    }
}
