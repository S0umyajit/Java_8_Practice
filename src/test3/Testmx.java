package test3;

import java.util.Arrays;
import java.util.List;

public class Testmx {
    public static void main(String[] args) {

        List<Integer>li= Arrays.asList(2,4,6);

        boolean b = li.stream()
                .allMatch(n -> n > 0);
        System.out.println(b);


        boolean b1 = li.stream()
                .anyMatch(n -> n % 3 == 0);
        System.out.println(b1);
    }
}
