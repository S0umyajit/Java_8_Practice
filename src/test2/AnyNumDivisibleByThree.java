package test2;

import java.util.Arrays;
import java.util.List;

public class AnyNumDivisibleByThree {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(1,2,3,4,5,7,6);

        boolean b = list.stream()
                .anyMatch(n -> n % 3 == 0);
        System.out.println(b);
    }
}
