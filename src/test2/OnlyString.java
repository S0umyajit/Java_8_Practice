package test2;

import java.util.Arrays;
import java.util.List;

public class OnlyString {
    public static void main(String[] args) {

        List<Object> mixedList = Arrays.asList("Apple", 12, "Banana", "Apricot", 45, "Ant", "Cherry");


        List<String> list = mixedList.stream()
                .filter(s -> s instanceof String)
                .map(s->(String)s)//DownCast
                .toList();
        System.out.println(list);
    }
}
