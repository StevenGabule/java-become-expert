package fundamental.array;

import java.util.Arrays;

public class ArrayOperationsDemo {
  public static void main(String[] args) {
    int[] arrNums = {9, 5, 7, 1, 3};

    // Sort
    Arrays.sort(arrNums);
    System.out.println(Arrays.toString(arrNums));
    // [1, 3, 5, 7, 9]

    // Searching
    int foundIndex = Arrays.binarySearch(arrNums, 5);
    System.out.println(5 + " found at index " + foundIndex);
    // 5 found at index 2

    // copying
    int[] copy = Arrays.copyOf(arrNums, 7);
    int[] copy2 = Arrays.copyOf(arrNums, arrNums.length);

    System.out.println("Extended copy 1: " + Arrays.toString(copy));
    // Extended copy 1: [1, 3, 5, 7, 9, 0, 0]

    System.out.println("Extended copy 2: " + Arrays.toString(copy2));
    // Extended copy 2: [1, 3, 5, 7, 9]

    int[] dest = new int[3];
    System.arraycopy(arrNums, 0, dest, 0, 3);
    System.out.println("Extended copy 3: " + Arrays.toString(dest));
  }
}
