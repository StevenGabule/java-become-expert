package fundamental.array.StudentManagementSystem;

import java.util.ArrayList;

public class StudentManager {
  private final ArrayList<Student> students = new ArrayList<>();

  public void addStudent(Student student) {
    students.add(student);
  }

  public Student getStudentById(int id) {
    for (Student student : students) {
      if(student.getId() == id) {
        return student;
      }
    }
    return null;
  }

  public boolean updateStudentName(int id, String newName) {
    Student student = getStudentById(id);
    if(student != null) {
      student.setName(newName);
      return true;
    }
    return false;
  }

  public boolean deleteStudent(int id) {
    return students.removeIf(student -> student.getId() == id);
  }

  public void listAllStudents() {
    students.forEach(System.out::println);
  }

  public ArrayList<Student> filterByGrade(double threshold) {
    ArrayList<Student> result = new ArrayList<>();
    for(Student student : students) {
      if(student.getGrade() >= threshold) {
        result.add(student);
      }
    }
    return result;
  }


}
