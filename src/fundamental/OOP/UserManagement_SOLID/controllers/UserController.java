package fundamental.OOP.UserManagement_SOLID.controllers;

import fundamental.OOP.UserManagement_SOLID.models.User;
import fundamental.OOP.UserManagement_SOLID.services.UserService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UserController {
  private final UserService userService;
  private final Scanner scanner;

  public UserController(UserService userService, Scanner scanner) {
    this.userService = userService;
    this.scanner = scanner;
  }

  public void start() {
    boolean running = true;
    while (running) {
      printMenu();
      String command = scanner.nextLine().trim().toLowerCase();
      switch (command) {
        case "create" -> createUser();
        case "read" -> readUser();
        case "update" -> updateUser();
        case "delete" -> deleteUser();
        case "list" -> listUsers();
        case "exit" -> running = false;
        default -> System.out.println("Invalid command");
      }
    }
    System.out.println("Exiting application");
  }

  private void listUsers() {
    List<User> users = userService.getAllUsers();
    if(users.isEmpty()) {
      System.out.println("No users found");
    } else {
      users.forEach(System.out::println);
    }
  }

  private void deleteUser() {
    System.out.println("Enter user ID:");
    long id = Long.parseLong(scanner.nextLine());
    userService.deleteUser(id);
    System.out.println("User " + id + " deleted");
  }

  private void updateUser() {
    System.out.println("Enter user ID:");
    long id = Long.parseLong(scanner.nextLine());
    Optional<User> user = userService.getUserById(id);
    if(user.isEmpty()) {
      System.out.println("User not found");
      return;
    }
    User existingUser = user.get();
    System.out.printf("Enter new name (current: %s):\n", existingUser.getName());
    String name = scanner.nextLine();
    System.out.printf("Enter new email (current: %s):\n", existingUser.getEmail());
    String email = scanner.nextLine();
    User updatedUser = new User(id, name, email);
    userService.updateUser(updatedUser);
    System.out.println("User successfully updated");
  }

  private void readUser() {
    System.out.println("Enter user ID:");
    long id = Long.parseLong(scanner.nextLine());
    Optional<User> user = userService.getUserById(id);
    user.ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));
  }

  private void createUser() {
    System.out.println("Enter name: ");
    String name = scanner.nextLine().trim();
    System.out.println("Enter email: ");
    String email = scanner.nextLine().trim();
    User user = new User(null, name, email);
    user = userService.createUser(user);
    System.out.println("User created with ID: " + user.getId());
  }

  private void printMenu() {
    System.out.println("\nEnter command (create, read, update, delete, list, exit):");
  }
}
