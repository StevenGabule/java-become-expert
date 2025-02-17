package fundamental.OOP.LibraryManagementSystem;

public class Main {
  public static void main(String[] args) {
    Book fictionBook = new FictionBook("The great gatsby", "F Scott Fitzgerald");
    Book nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari");

    // add books to the library
    Library.addBooks(fictionBook);
    Library.addBooks(nonFictionBook);

    User user = new User("John Paul L. Gabule");

    System.out.println("\n--- Library Statistics ---");
    Library.displayStatistics();

    // User borrows a book
    System.out.println("\n--- Borrowing Books ---");
    user.borrowBook(fictionBook);
    user.borrowBook(nonFictionBook);

    // display library statistics after borrowing
    System.out.println("\n--- Updated Library Statistics ---");
    Library.displayStatistics();

    // User tries to borrow the same book again
    System.out.println("\n--- Trying to borrow again ---");
    user.borrowBook(fictionBook);

    // User returns a book
    System.out.println("\n--- Returning Books ---");
    user.returnBook(fictionBook);

    // Display library statistics after returning
    System.out.println("\n--- Updated Library Statistics ---");
    Library.displayStatistics();
  }
}
