package test5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LargeWordFlomSentc {
    public static void main(String[] args) {

        String t = "The brown do, jumped over the bridgr";

        String s = Arrays.stream(t.toLowerCase().
                        replaceAll("[^a-z\\s]", "")
                        .split(" "))
                .max(Comparator.comparing(String::length))
                .orElse("");

        System.out.println(s);
    }
}
