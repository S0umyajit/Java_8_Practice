package test2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AsencendingAndDescending {
    public static void main(String[] args) {

        List<Integer> lis= Arrays.asList(3,4,5,1,5,6,8);
        List<Integer> ascendingOrder = lis.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(ascendingOrder);

        List<Integer> descendingOrder = lis.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(descendingOrder);
    }
}
