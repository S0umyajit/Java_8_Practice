package test3;

import java.util.*;
import java.util.stream.Collectors;

public class Test45 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                // Original 6 Employees
                new Employee(101, "Alice", 28, "IT", 75000.0),
                new Employee(102, "Bob", 35, "HR", 62000.0),
                new Employee(103, "Charlie", 42, "Finance", 85000.0),
                new Employee(104, "David", 24, "IT", 92000.0),
                new Employee(105, "Eva", 30, "Marketing", 68000.0),
                new Employee(106, "Frank", 50, "Finance", 120000.0),

                // 14 New Employees
                new Employee(107, "Grace", 29, "HR", 64000.0),
                new Employee(108, "Henry", 31, "IT", 81000.0),
                new Employee(109, "Ian", 45, "Operations", 72000.0),
                new Employee(110, "Julia", 27, "Marketing", 69000.0),
                new Employee(111, "Kevin", 38, "Finance", 95000.0),
                new Employee(112, "Laura", 26, "IT", 78000.0),
                new Employee(113, "Michael", 41, "Operations", 88000.0),
                new Employee(114, "Nina", 33, "HR", 67000.0),
                new Employee(115, "Owen", 48, "Finance", 115000.0),
                new Employee(116, "Paula", 35, "Marketing", 73000.0),
                new Employee(117, "Quinn", 23, "IT", 60000.0),
                new Employee(118, "Rachel", 32, "Operations", 79000.0),
                new Employee(119, "Sam", 29, "Sales", 55000.0),
                new Employee(120, "Tina", 36, "Sales", 71000.0)
        );

        Map<String, Optional<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(collect);


        Map<String, Long> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

        List<Map.Entry<String, Long>> list = collect1.entrySet()
                .stream()
                .filter(e -> e.getValue() > 2)
                .toList();
        System.out.println(list);
    }
}
