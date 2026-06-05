package test3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewT {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", 28, "IT", 75000.0),
                new Employee(102, "Bob", 35, "HR", 62000.0),
                new Employee(103, "Charlie", 42, "Finance", 85000.0),
                new Employee(104, "David", 24, "IT", 92000.0),
                new Employee(105, "Eva", 30, "Marketing", 68000.0),
                new Employee(106, "Frank", 50, "Finance", 120000.0)
        );

        List<Employee> list = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();
        System.out.println(list);

        OptionalDouble average = employees
                .stream()
                .map(e -> e.getAge())
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(average);


        List<Integer>ii=Arrays.asList(1,2,3,4,5,6,7,8);
        Map<Boolean, List<Integer>> collect = ii.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);


        List<String>lo=Arrays.asList("apple","apple","banana","guava","banana");


        Map<String, Long> collect1 = lo.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);


        Map<String, Double> collect2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect2);


        Map<String, Double> collect3 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingInt(Employee::getAge)));
        System.out.println(collect3);
    }
}
