package fundamental.array;

import java.util.Arrays;

public class PrintArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    System.out.println(Arrays.toString(arr));
    // [1, 2, 3]

    int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
    System.out.println(Arrays.deepToString(matrix));
    // [[1, 2, 3], [4, 5, 6]]

    int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int total = 0;

    for (int i = 0; i < arrayOfNumbers.length; i++) {
      total += arrayOfNumbers[i];
    }

    System.out.println("Using For Loop: " + total);
    // Using For Loop: 55

    total = 0;
    for (int num : arrayOfNumbers) {
      total += num;
    }

    System.out.println("Using For In: " + total);
    // Using For In: 55
  }
}
