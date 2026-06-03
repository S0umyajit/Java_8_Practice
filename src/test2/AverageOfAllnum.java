package test2;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfAllnum {
    public static void main(String[] args) {

        List<Integer>li= Arrays.asList(1,2,3,5,7);

        OptionalDouble average = li.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(average);
    }
}
