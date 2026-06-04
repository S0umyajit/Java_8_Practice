package test5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RevEachWord {
    public static void main(String[] args) {

        String s="Java Stream is Powerful";

//        List<String> list = Arrays.stream(s.split(" "))
//                .map(word -> new StringBuilder(word).reverse().toString())
//                .toList();
//
//        String collect = list.stream()
//                .collect(Collectors.joining(" "));
//
//        System.out.println(collect);

        String collect1 = Arrays.stream(s.split(" "))
                .map(word -> Arrays.stream(word.split(""))
                        .reduce("", (pre, next) -> next + pre))
                .collect(Collectors.joining(" "));

        System.out.println(collect1);
    }
}
