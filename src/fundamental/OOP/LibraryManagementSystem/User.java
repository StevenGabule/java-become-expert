package fundamental.OOP.LibraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class User {
  private final String name;
  private final String username;
  private final String password;

  private static final Map<String, User> users = new HashMap<>();

  public User(String name, String username, String password) {
    this.name = name;
    this.username = username;
    this.password = password;
    users.put(username, this); // store the user in the map
  }

  public String getUsername() {
    return username;
  }

  public boolean authenticate(String password) {
    return  this.password.equals(password);
  }

  public static User login(String username, String password) {
    User user = users.get(username);
    if (user != null && user.authenticate(password)) {
      System.out.println("Login successful: Welcome, " + user.name + "!");
      return user;
    } else {
      System.out.println("Invalid username or password");
      return null;
    }
  }

  // Method to borrow a book
  public void borrowBook(Book book) {
    System.out.println(name + " is trying to borrow a book...");
    book.borrowBook();
  }

  // Method to return a book
  public void returnBook(Book book) {
    System.out.println(name + " is returning a book...");
    book.returnBook();
  }
}
