package test2;

import java.util.Arrays;
import java.util.List;

public class Prac1 {
    public static void main(String[] args) {

        List<Integer> li= Arrays.asList(1,2,1,1,1,1,1,1,3,2,3,2,3,5,7,8,1,3,4,4,5,6);

        List<Integer> list = li.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(list);
    }
}
