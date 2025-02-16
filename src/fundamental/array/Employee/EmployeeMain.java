package fundamental.array.Employee;

import java.util.Arrays;

public class EmployeeMain {
  public static void main(String[] args) {
    Employee[] employees = {
        new Employee(101, "Alice", "Engineering", 85000),
        new Employee(102, "Bob", "Marketing", 75000),
        new Employee(103, "Charlie", "Engineering", 95000),
        new Employee(104, "David", "HR", 65000),
    };

    // Binary Search (required to be sorted array)
    Arrays.sort(employees);
    Employee foundEmployee = EmployeeSearch.BinarySearchById(employees, 103);
    System.out.println("Binary search result:");
    System.out.println(foundEmployee);

    // Linear Name Search
    // NOTE: O(n) time complexity (slower for large datasets).
    Employee[] alice = EmployeeSearch.searchByName(employees, "Alice");

    System.out.println("\nEmployees named 'alice': ");
    Arrays.stream(alice).forEach(System.out::println);

    // multi-search filter
    Employee[] engHighEarners = EmployeeSearch.filterEmployees(employees, "Engineering", 80000, 100000);
    System.out.println("\nEngineering employee earning $80k-$100k");
    Arrays.stream(engHighEarners).forEach(System.out::println);
  }
}
