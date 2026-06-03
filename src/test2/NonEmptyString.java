package test2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NonEmptyString
{
    public static void main(String[] args) {

        List<String> mixedList = Arrays.asList("", "SS", "", "Ant", "Cherry","");

        Optional<String> first = mixedList
                .stream()
                .filter(s -> !s.isEmpty())
                .findFirst();

        System.out.println(first);
    }

}
