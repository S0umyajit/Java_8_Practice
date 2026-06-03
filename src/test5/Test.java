package test5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice"),
                new Employee(102, "Bob"),        // Existing Value
                new Employee(103, "Charlie"),
                new Employee(102, "Robert")      // New Value (Duplicate ID!)
        );

        Map<Integer, String> collect = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Employee::getName,
                        (existingValue,newValue)->existingValue /// keep existing value for duplicate key
                ));

        System.out.println(collect);
    }
}
