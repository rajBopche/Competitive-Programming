package problems;

public class CountBishopMoves {
    public int countMoves(int A, int B) {

        int moves = 0;

        int topLeftMoves = Math.min((A - 1), (B - 1));
        int topRightMoves = Math.min((A - 1), (8 - B));
        int bottomLeftMoves = Math.min((8 - A), (B - 1));
        int bottomRightMoves = Math.min((8 - A), (8 - B));

        moves = topLeftMoves + topRightMoves + bottomLeftMoves + bottomRightMoves;
        return moves;
    }
}
