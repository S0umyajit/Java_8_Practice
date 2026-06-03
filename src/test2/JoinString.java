package test2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinString {
    public static void main(String[] args) {

        List<String> mixedList = Arrays.asList("Apple", "Banana", "Apricot", "Ant", "Cherry","anu");

        String collect = mixedList.stream()
                .collect(Collectors.joining(","));
        System.out.println(collect);

    }
}
