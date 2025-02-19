package fundamental.OOP.UserManagement_SOLID;

import fundamental.OOP.UserManagement_SOLID.controllers.UserController;
import fundamental.OOP.UserManagement_SOLID.interfaces.UserRepository;
import fundamental.OOP.UserManagement_SOLID.repositories.InMemoryUserRepository;
import fundamental.OOP.UserManagement_SOLID.services.UserService;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    UserRepository userRepository = new InMemoryUserRepository();
    UserService userService = new UserService(userRepository);
    Scanner scanner = new Scanner(System.in);
    UserController controller = new UserController(userService, scanner);
    controller.start();
    scanner.close();
  }
}
