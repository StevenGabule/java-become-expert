package fundamental.OOP.LibraryManagementSystem;

public class BiographyBook extends Book {
  public BiographyBook(String title, String author) {
    super(title, author);
  }

  @Override
  public void describeType() {
    System.out.println("Biography book");
  }
}
