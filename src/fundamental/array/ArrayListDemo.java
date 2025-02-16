package fundamental.array;

import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("John");
    names.add("Paul");
    names.add("Mary");
    names.add("Bob");

    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
      // John
      // Paul
      // Mary
      // Bob
    }

    System.out.println();

    for (String i : names) {
      System.out.println(i);
      // John
      // Paul
      // Mary
      // Bob
    }

  }
}
