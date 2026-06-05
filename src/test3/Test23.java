package test3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test23 {
    public static void main(String[] args) {

        List<String>li= Arrays.asList("Apple","Banana","Ant","Anu","njbhbh","uuuu");


        long a = li.stream()
                .filter(s -> s.toLowerCase().startsWith("a"))
                .count();
        System.out.println(a);


        String collect = li.stream()
                .collect(Collectors.joining(","));

        System.out.println(collect);
    }
}
