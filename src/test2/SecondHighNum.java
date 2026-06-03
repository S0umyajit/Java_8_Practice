package test2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighNum {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(4,2,6,2,3,8,910,78,773,978);

        Optional<Integer> secondHighNum = list.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .skip(1)
                .findFirst();
        System.out.println(secondHighNum);
    }
}
