package fundamental.OOP.LibraryManagementSystem;

public abstract class Book {
  private final String title;
  private final String author;
  private boolean isBorrowed;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.isBorrowed = false;
  }

  public String getTitle() {return title;}
  public String getAuthor() {return author;}
  public boolean isBorrowed() {return isBorrowed;}
  public void borrowBook() {
    if(!isBorrowed) {
      isBorrowed = true;
      Library.incrementBorrowBooks();
      System.out.println("You successfully borrowed a book.'" + title + "'.");
    } else {
      System.out.println("Sorry, '" + title+ "' is already borrowed.");
    }
  }
  public void returnBook() {
    if(isBorrowed) {
      isBorrowed = false;
      Library.decrementBorrowBooks();
      System.out.println("You successfully returned a book.'" + title + "'.");
    } else {
      System.out.println("This book is not currently borrowed.");
    }
  }

  public abstract void describeType();
}
