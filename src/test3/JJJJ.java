package test3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JJJJ {
    public static void main(String[] args) {

        List<String>ll= Arrays.asList("","","As","Iran","India","");

        Optional<String> first = ll.stream()
                .filter(n -> !n.isEmpty())
                .findFirst();
        System.out.println(first);
    }
}
