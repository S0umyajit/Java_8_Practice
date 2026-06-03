package test3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prac1 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", "IT", 75000.0),
                new Employee(102, "Bob", "HR", 62000.0),
                new Employee(103, "Charlie", "Finance", 85000.0),
                new Employee(104, "David", "IT", 92000.0),
                new Employee(105, "Eva", "Marketing", 68000.0)
        );

        List<Employee> list = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();
        System.out.println(list);


    }
}
