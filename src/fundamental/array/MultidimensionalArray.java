package fundamental.array;

public class MultidimensionalArray {
  public static void main(String[] args) {
    // Rectangle 2D array (3x3)
    int[][] matrix = new int[3][3];
    matrix[0][0] = 1;
    matrix[0][1] = 2;
    matrix[0][2] = 3;
    matrix[1][0] = 4;
    matrix[1][1] = 5;
    matrix[1][2] = 6;
    matrix[2][0] = 7;
    matrix[2][1] = 8;
    matrix[2][2] = 9;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " "); // 1 2 3 4 5 6 7 8 9
      }
    }

    System.out.println();

    int[][] jagged = new int[3][];
    jagged[0] = new int[2];
    jagged[1] = new int[4];
    jagged[2] = new int[3];

    // 3D array (2x3x4)
    int[][][] cube = new int[2][3][4];

    int[][] grid = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    // Access 2D array element
    int value = grid[1][2]; // 6

    // Update array element
    jagged[0][1] = 100;

    // Nested For-Loops (2D)
//    for (int i = 0; i < grid.length; i++) {
//      for (int j = 0; i < grid[i].length; j++) {
//        System.out.print(grid[i][j] + " ");
//      }
//      System.out.println();
//    }

    // Enhanced For-Loops (Jagged)
    for (int[] row : jagged) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}
