public class chw_103 {

    public static void main(String[] args) {

        int row = 3;
        int col = 3;

        boolean[][] board = new boolean[row][col];

        mazepath(0, 0, row - 1, col - 1, "", board);
    }

    private static void mazepath(int sr, int sc, int er, int ec,
                                 String path, boolean[][] board) {

        // Out of Boundary
        if (sr < 0 || sc < 0)
            return;

        if (sr > er || sc > ec)
            return;

        // Already Visited
        if (board[sr][sc])
            return;

        // Destination
        if (sr == er && sc == ec) {
            System.out.println(path);
            return;
        }

        // Mark Visited
        board[sr][sc] = true;

        // Right
        mazepath(sr, sc + 1, er, ec, path + "R", board);

        // Down
        mazepath(sr + 1, sc, er, ec, path + "D", board);

        // Left
        mazepath(sr, sc - 1, er, ec, path + "L", board);

        // Up
        mazepath(sr - 1, sc, er, ec, path + "U", board);

        // Backtracking
        board[sr][sc] = false;
    }
}