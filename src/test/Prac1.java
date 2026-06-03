package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prac1 {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4);

        Stream<Integer> stream = list.stream();

        int arr[]={1,2,3,4};

        IntStream stream1 = Arrays.stream(arr);


        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);


        Stream.generate(Math::random).limit(5);
    }
}
