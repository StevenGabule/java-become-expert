package fundamental.OOP.LibraryManagementSystem;

public class NonFictionBook extends Book {

  public NonFictionBook(String title, String author) {
    super(title, author);
  }

  @Override
  public void describeType() {
    System.out.println("Non-Fiction Book");
  }
}
