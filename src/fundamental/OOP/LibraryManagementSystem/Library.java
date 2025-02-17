package fundamental.OOP.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private static List<Book> books = new ArrayList<>();
  private static int totalBooks = 0;
  private static int borrowedBooks = 0;

  public static void addBook(Book book) {
    books.add(book);
    totalBooks++;
    System.out.println("Added Book: '" + book.getTitle() + "' by " + book.getAuthor());
  }

  public static void incrementBorrowBooks() {
    borrowedBooks++;
  }

  public static void decrementBorrowBooks() {
    borrowedBooks--;
  }

  public static void displayStatistics() {
    System.out.println("Total Books: " + totalBooks);
    System.out.println("Borrowed Books: " + borrowedBooks);
    System.out.println("Available Books: " + (totalBooks - borrowedBooks));
  }

  // Search for books by title or author
  public static List<Book> searchBooks(String query) {
    List<Book> results = new ArrayList<>();
    for (Book book : books) {
      if (book.getTitle().toLowerCase().contains(query.toLowerCase()) || book.getAuthor().toLowerCase().contains(query.toLowerCase())) {
        results.add(book);
      }
    }
    return results;
  }
}
