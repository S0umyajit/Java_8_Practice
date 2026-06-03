package test3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfEle {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("Apple","Banana","Apple","Banana","Guava");

        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
