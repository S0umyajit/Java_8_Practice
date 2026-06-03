package test;

import java.util.Arrays;
import java.util.List;

public class Prac2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> evenNum=list.stream()
                .filter(n->n%2==0)
                .toList();
        System.out.println(evenNum);

        List<Integer> oddNum=list.stream()
                .filter(n->n%2!=0)
                .toList();

        System.out.println(oddNum);
    }
}
