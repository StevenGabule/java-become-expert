package fundamental.array.Chessboard;

public class Chessboard {
  private static final int SIZE = 8;
  private final String[][] chessboard = new String[SIZE][SIZE];

  // Initialize board with empty squares and places
  public Chessboard() {
    for (int i = 0; i < SIZE; i++) {
      for(int j = 0; j < SIZE; j++) {
        chessboard[i][j] = " ";
      }
    }

    // Place initial places
    chessboard[0] = new String[] {"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"};
    chessboard[1] = new String[] {"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"};
    chessboard[6] = new String[] {"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"};
    chessboard[7] = new String[] {"♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖"};
  }

  public void printChessBoard() {
    for(int i = 0; i < SIZE; i++) {
      System.out.print((8-i) + " |");
      for(int j = 0; j < SIZE;j++) {
        System.out.print(chessboard[i][j] + "|");
      }
      System.out.println("\n  -------------------------");
    }
    System.out.println("    a  b  c  d  e  f  g  h ");
  }
}
