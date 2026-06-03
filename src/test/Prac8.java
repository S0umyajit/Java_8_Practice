package test;

import java.util.Arrays;
import java.util.List;

public class Prac8 {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(1,2,3,4,5);

        Integer sum = li.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println(sum);


        int sum1 = li.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum1);
    }
}
