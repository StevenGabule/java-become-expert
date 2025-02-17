package fundamental.OOP.LibraryManagementSystem;

public class ScienceFictionBook extends Book {
  public ScienceFictionBook(String title, String author) {
    super(title, author);
  }

  @Override
  public void describeType() {
    System.out.println("Science Fiction Book");
  }
}
