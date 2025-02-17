package fundamental.OOP.LibraryManagementSystem;

public class FictionBook extends Book {
  public FictionBook(String title, String author) {
    super(title, author);
  }

  @Override
  public void describeType() {
    System.out.println("Fiction Book");
  }
}
