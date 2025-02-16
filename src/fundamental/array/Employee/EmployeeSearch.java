package fundamental.array.Employee;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSearch {
  /**
   * Binary search for ID (array must be sorted by ID)
   * @param employees Employee
   * @param targetId int
   * @return Employee
   */
  public static Employee BinarySearchById(Employee[] employees, int targetId) {
    Comparator<Employee> idComparator = Comparator.comparing(Employee::getId);
    int index = Arrays.binarySearch(employees, new Employee(targetId ,"", "", 0), idComparator);
    return (index >= 0) ? employees[index] : null;
  }

  /**
   * Linear search for name (case-insensitive)
   * @param employees  Employee[]
   * @param name String
   * @return Employee[]
   */
  public static Employee[] searchByName(Employee[] employees, String name) {
    return Arrays
            .stream(employees)
            .filter(e -> e.getName().equals(name))
            .toArray(Employee[]::new);
  }

  /**
   * Linear search for name (case-insensitive)
   * @param employees  Employee[]
   * @param department String
   * @return Employee[]
   */
  public static Employee[] searchByDepartment(Employee[] employees, String department) {
    return Arrays
            .stream(employees)
            .filter(e -> e.getDepartment().equals(department))
            .toArray(Employee[]::new);
  }

  /**
   * Get the employees by multiple filter
   * @param employees Employee[]
   * @param department String
   * @param minSalary double
   * @param maxSalary double
   * @return Employee[]
   */
  public static Employee[] filterEmployees(Employee[] employees, String department, double minSalary, double maxSalary) {
    return Arrays.stream(employees)
        .filter(e -> e.getDepartment().equals(department))
        .filter(e -> e.getSalary() >= minSalary && e.getSalary() <= maxSalary)
        .toArray(Employee[]::new);
  }
}
