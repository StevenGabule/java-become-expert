package fundamental.array.Chessboard;

public class KnightValidator {
  public static boolean isValidMove(int[][] moves, int startX, int startY, int endX, int endY) {

    // All possible knight moves  (±2 in one axis, ±1 in the other)
    int[][] knightMoves = {
        {2,1}, {2, -1}, {-2, 1}, {-2,-1},
        {1,2}, {1, -2}, {-1, 2}, {-1,2}
    };

    for (int[] move : knightMoves) {
      if(startX + move[0] == endX && startY + move[1] == endY) {
        return true;
      }
    }
    return false;
  }
}
