package test4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prac2 {
    public static void main(String[] args) {
        List<EmployeeNew> employees = Arrays.asList(
                new EmployeeNew(101, "Alice", 28, "IT", 75000.0),
                new EmployeeNew(102, "Bob", 35, "HR", 62000.0),
                new EmployeeNew(103, "Charlie", 42, "Finance", 85000.0),
                new EmployeeNew(104, "David", 24, "IT", 92000.0),
                new EmployeeNew(105, "Eva", 30, "Marketing", 68000.0),
                new EmployeeNew(106, "Frank", 50, "Finance", 120000.0)
        );

        Map<String, Long> collect = employees.stream()
                .collect(Collectors.groupingBy(EmployeeNew::getDept, Collectors.counting()));

        List<Map.Entry<String, Long>> list = collect.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .toList();
        System.out.println(list);
    }
}
