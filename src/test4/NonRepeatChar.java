package test4;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatChar {
    public static void main(String[] args) {

        String s="SWISS";
        Optional<Map.Entry<Character, Long>> list = s.chars()
                .mapToObj(a -> (char) a)
                .collect(Collectors.groupingBy(Function.identity()
                        , LinkedHashMap::new
                        ,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst();

        System.out.println(list);

    }
}
