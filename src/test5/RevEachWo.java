package test5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RevEachWo {
    public static void main(String[] args) {
        String s="Java Stream is Powerful";

//        String collect = Arrays.stream(s.toLowerCase()
//                        .split(" "))
//                .map(word -> new StringBuilder(word).reverse())
//                .collect(Collectors.joining(" "));
//        System.out.println(collect);


        String collect = Arrays.stream(s.split(" "))
                .map(word -> Arrays.stream(word.split(""))
                        .reduce("", (pr, rv) -> rv + pr))
                .collect(Collectors.joining(" "));
        System.out.println(collect);

    }
}
