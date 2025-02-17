package fundamental.OOP.LibraryManagementSystem;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Book fictionBook = new FictionBook("The great gatsby", "F Scott Fitzgerald");
    Book nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari");
    Book sciFiBook = new ScienceFictionBook("Dune", "Frank Herbert");

    // add books to the library
    Library.addBook(fictionBook);
    Library.addBook(nonFictionBook);
    Library.addBook(sciFiBook);

    User john = new User("John Paul L. Gabule", "john123", "password123");
    User bob = new User("Bob Myer", "bob456", "password456");

    // Login
    User currentUser = User.login("john123", "password123");

    if (currentUser != null) {
      currentUser.borrowBook(fictionBook);

      // search for books
      System.out.println("\n--- Searching for Books ---");
      List<Book> searchResults = Library.searchBooks("Sapiens");
      for (Book book : searchResults) {
        System.out.println("Found: " + book.getTitle() + " by " + book.getAuthor());
      }

      // Return a book after the due date
      System.out.println("\n--- Returning a Book Late ---");
      try {
        Thread.sleep(1000);  // Simulate time passing
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      currentUser.returnBook(fictionBook);

      // Display library statistics
      System.out.println("\n--- Library Statistics ---");
      Library.displayStatistics();

    }

//    System.out.println("\n--- Library Statistics ---");
//    Library.displayStatistics();
//
//    // User borrows a book
//    System.out.println("\n--- Borrowing Books ---");
//    john.borrowBook(fictionBook);
//    john.borrowBook(nonFictionBook);
//
//    // display library statistics after borrowing
//    System.out.println("\n--- Updated Library Statistics ---");
//    Library.displayStatistics();
//
//    // User tries to borrow the same book again
//    System.out.println("\n--- Trying to borrow again ---");
//    john.borrowBook(fictionBook);
//
//    // User returns a book
//    System.out.println("\n--- Returning Books ---");
//    john.returnBook(fictionBook);
//
//    // Display library statistics after returning
//    System.out.println("\n--- Updated Library Statistics ---");
//    Library.displayStatistics();
  }
}
