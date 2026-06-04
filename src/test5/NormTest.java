package test5;

import java.util.*;
import java.util.stream.Collectors;

public class NormTest {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", 28, "HR", 60000),
                new Employee(102, "Bob", 32, "IT", 85000),
                new Employee(103, "Charlie", 25, "IT", 70000),
                new Employee(104, "David", 40, "Finance", 95000),
                new Employee(105, "Eva", 35, "HR", 65000),
                new Employee(106, "Frank", 30, "Marketing", 55000),
                new Employee(107, "Grace", 29, "IT", 82000),
                new Employee(108, "Henry", 45, "Finance", 110000),
                new Employee(109, "Ivy", 26, "Marketing", 52000),
                new Employee(110, "Jack", 31, "IT", 78000),
                new Employee(111, "Kelly", 33, "HR", 62000),
                new Employee(112, "Liam", 38, "Finance", 99000),
                new Employee(113, "Mia", 24, "IT", 68000),
                new Employee(114, "Noah", 42, "Marketing", 58000),
                new Employee(115, "Olivia", 27, "HR", 61000),
                new Employee(116, "Peter", 36, "Finance", 105000),
                new Employee(116, "Peter Parker", 21, "IT", 45000), // Duplicate ID 116 (New Value)
                new Employee(117, "Quinn", 30, "Marketing", 54000),
                new Employee(118, "Ryan", 34, "IT", 90000),
                new Employee(118, "Ryan Reynolds", 47, "Marketing", 120000), // Duplicate ID 118 (New Value)
                new Employee(119, "Sam", 23, "HR", 50000),
                new Employee(120, "Tina", 39, "Finance", 102000)
        );

        Map<Character, Long> collect = employees.stream()
                .map(n -> n.getName().charAt(0))
                .collect(Collectors.groupingBy(n -> (char) n, Collectors.counting()));

        Optional<Map.Entry<Character, Long>> max = collect.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        System.out.println(max);
    }
}
