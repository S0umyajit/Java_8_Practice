package test4;

import java.util.*;
import java.util.stream.Collectors;

public class Prac1 {
    public static void main(String[] args) {

        List<EmployeeNew> employees = Arrays.asList(
                new EmployeeNew(101, "Alice", 28, "IT", 75000.0),
                new EmployeeNew(102, "Bob", 35, "HR", 62000.0),
                new EmployeeNew(103, "Charlie", 42, "Finance", 85000.0),
                new EmployeeNew(104, "David", 24, "IT", 92000.0),
                new EmployeeNew(105, "Eva", 30, "Marketing", 68000.0),
                new EmployeeNew(106, "Frank", 50, "Finance", 120000.0)
        );

        Map<String, Optional<EmployeeNew>> collect = employees.stream()
                .collect(Collectors.groupingBy(EmployeeNew::getDept,
                        Collectors.maxBy(Comparator.comparing(EmployeeNew::getSalary))));

        System.out.println(collect);
    }
}
