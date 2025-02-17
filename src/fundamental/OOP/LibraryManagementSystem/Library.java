package fundamental.OOP.LibraryManagementSystem;

public class Library {
  private static int totalBooks = 0;
  private static int borrowedBooks = 0;

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

  public static void addBooks(Book book) {
    totalBooks++;
    System.out.println("Added Book: '" + book.getTitle() + "' by " + book.getAuthor());
  }
}
