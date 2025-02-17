package fundamental.OOP.LibraryManagementSystem;

import java.time.LocalDate;

public abstract class Book {
  private final String title;
  private final String author;
  private boolean isBorrowed;
  private LocalDate dueDate;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.isBorrowed = false;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public boolean isBorrowed() {
    return isBorrowed;
  }

  public void borrowBook() {
    if (!isBorrowed) {
      isBorrowed = true;
      dueDate = LocalDate.now().plusDays(14);
      Library.incrementBorrowBooks();
      System.out.println("You successfully borrowed a book.'" + title + "'. Due date: " + dueDate);
    } else {
      System.out.println("Sorry, '" + title + "' is already borrowed.");
    }
  }

  public void returnBook() {
    if (isBorrowed) {
      isBorrowed = false;
      Library.decrementBorrowBooks();
      int fine = calculateFine();
      if(fine > 0) {
        System.out.println("You have returned '" + fine + "' late. Fine: $" + fine);
      } else {
        System.out.println("You successfully returned a book.'" + title + "'.");
      }
    } else {
      System.out.println("This book is not currently borrowed.");
    }
  }

  private int calculateFine() {
    if (LocalDate.now().isAfter(dueDate)) {
      long daysLate = java.time.temporal.ChronoUnit.DAYS.between(dueDate, LocalDate.now());
      return (int) daysLate * 5;
    }
    return 0;
  }

  public abstract void describeType();
}
