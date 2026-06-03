package test5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElement {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,1,2,4);

        Set<Integer>set=new HashSet<>();

        List<Integer> list1 = list.stream()
                .filter(n -> !set.add(n))
                .toList();
        System.out.println(list1);
    }
}
