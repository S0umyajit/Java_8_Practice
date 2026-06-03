package test;

import java.util.Arrays;
import java.util.List;

public class Prac7 {
    public static void main(String[] args) {

        List<Integer>li= Arrays.asList(1,2,3,4,5);
        Integer reduce = li.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

        Integer reduce1 = li.stream()
                .reduce(0, Integer::sum);
        System.out.println(reduce1);

        int sum = li.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        int sum1 = li.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println(sum1);


    }
}
