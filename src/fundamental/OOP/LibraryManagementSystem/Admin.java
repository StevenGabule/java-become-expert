package fundamental.OOP.LibraryManagementSystem;

public class Admin {
  private final String username = "admin";
  private final String password = "admin123";

  public boolean authenticate(String password) {
    return this.password.equals(password);
  }

  public void addBook(Book book) {
    Library.addBook(book);
  }

  public void removeBook(Book book) {
    Library.displayStatistics();
  }
}
