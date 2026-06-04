package test5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Tes {
    public static void main(String[] args) {
        String t = "The brown do, jumped over the bridgr";

        Stream<String> stream = Arrays.stream(t.toLowerCase()
                .replaceAll("[^a-z\\s]", "")
                .split(" "));
//stream.forEach(System.out::println);

        Optional<String> max = stream.max(Comparator.comparing(String::length));
        System.out.println(max);
    }
}
