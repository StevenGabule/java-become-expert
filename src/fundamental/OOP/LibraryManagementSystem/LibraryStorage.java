package fundamental.OOP.LibraryManagementSystem;

import java.io.*;
import java.util.List;

public class LibraryStorage {
  private static final String  FILE_PATH = "library_data.txt";

  public static void saveData(List<Book> books) {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
      oos.writeObject(books);
      System.out.println("Library Data saved to successfully.");
    } catch (IOException e) {
      System.out.println();
    }
  }

  public static List<Book> loadData() {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
      return (List<Book>) ois.readObject();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Error reading library data: " + e.getMessage());
      return null;
    }
  }
}
