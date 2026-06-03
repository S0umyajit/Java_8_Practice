package test2;

import java.util.Arrays;
import java.util.List;

public class StartWithA {

    public static void main(String[] args) {
        List<String> mixedList = Arrays.asList("Apple", "Banana", "Apricot", "Ant", "Cherry","anu");
        long a = mixedList.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println(a);
    }
}
