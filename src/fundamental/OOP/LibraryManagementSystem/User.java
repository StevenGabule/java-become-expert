package fundamental.OOP.LibraryManagementSystem;

public class User {
  private final String name;

  public User(String name) {
    this.name = name;
  }

  public void borrowBook(Book book) {
    System.out.println(name + " is trying to borrow a book...");
    book.borrowBook();
  }

  public void returnBook(Book book) {
    System.out.println(name + " is returning a book...");
    book.returnBook();
  }
}
