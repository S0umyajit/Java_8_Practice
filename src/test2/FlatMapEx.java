package test2;

import java.util.Collection;
import java.util.List;

public class FlatMapEx {
    public static void main(String[] args) {

        List<List<String>> fruitTeams = List.of(
                List.of("Apple", "Apricot"),
                List.of("Banana", "Blueberry"),
                List.of("Cherry")
        );

        List<String> list = fruitTeams.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(list);
    }
}
