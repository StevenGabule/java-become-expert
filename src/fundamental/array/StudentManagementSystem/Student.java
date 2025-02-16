package fundamental.array.StudentManagementSystem;

public class Student {
  private final int id;
  private String name;
  private double grade;

  public Student(int id, String name, double grade) {
    this.id = id;
    this.name = name;
    this.grade = grade;
  }

  public int getId() { return this.id; }
  public void setName(String name) { this.name = name; }
  public String getName() { return this.name; }
  public void setGrade(double grade) { this.grade = grade; }
  public double getGrade() { return this.grade; }

  @Override
  public String toString() {
    return "ID: " + id + " | Name: " + name + " | Grade: " + grade;
  }
}
