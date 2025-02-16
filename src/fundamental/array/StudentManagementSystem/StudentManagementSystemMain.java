package fundamental.array.StudentManagementSystem;

import java.util.ArrayList;

public class StudentManagementSystemMain {
  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    // add students
    manager.addStudent(new Student(1, "Alice", 85.0));
    manager.addStudent(new Student(2, "Bob", 92.0));
    manager.addStudent(new Student(3, "Charlie", 76.3));
    System.out.println("All Students:");
    manager.listAllStudents();
    System.out.println();

    // update student name
    if(manager.updateStudentName(2, "Bobby")) {
      System.out.println("Updated Student");
    }
    System.out.println();
    // delete a student
    if(manager.deleteStudent(3)) {
      System.out.println("Deleted Student");
    }
    System.out.println();
//    System.out.println("All Students:");
//    manager.listAllStudents();

    // Filter students with grade >= 80.0
    ArrayList<Student> topStudents = manager.filterByGrade(80.0);
    topStudents.forEach(System.out::println);
  }
}
