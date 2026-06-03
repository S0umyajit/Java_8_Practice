package test;

import java.util.Arrays;
import java.util.List;

public class Prac6 {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(1,2,3,4,5,6,7,8,9);

        long count = li.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println(count);
    }
}
