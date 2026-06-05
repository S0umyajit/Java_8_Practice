package test3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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

        Map<String, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        System.out.println(collect);
    }
}
