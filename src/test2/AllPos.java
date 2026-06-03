package test2;

import java.util.Arrays;
import java.util.List;

public class AllPos {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(1,2,3,45,2,-1);

        boolean b = list.stream()
                .allMatch(s -> s > 0);
        System.out.println(b);
    }
}
