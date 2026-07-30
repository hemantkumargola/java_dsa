// rat   in a maze problem -3
public class chw_104 {
// back traking 
    public static void main(String[] args) {

        int rows = 3;
        int cols = 4;

        int[][] maze = {
                {1, 0, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 1}
        };

        boolean[][] isVisited = new boolean[rows][cols];

        print(0, 0, rows - 1, cols - 1, "", maze, isVisited);
    }

    private static void print(int sr, int sc, int er, int ec,
                              String s, int[][] maze, boolean[][] isVisited) {

        // Out of boundary
        if (sr < 0 || sc < 0)
            return;

        if (sr > er || sc > ec)
            return;

        // Destination reached
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        // Blocked cell
        if (maze[sr][sc] == 0)
            return;

        // Already visited
        if (isVisited[sr][sc] == true)
            return;

        // Mark visited
        isVisited[sr][sc] = true;

        // Go Right
        print(sr, sc + 1, er, ec, s + "R", maze, isVisited);

        // Go Down
        print(sr + 1, sc, er, ec, s + "D", maze, isVisited);

        // Go Left
        print(sr, sc - 1, er, ec, s + "L", maze, isVisited);

        // Go Up
        print(sr - 1, sc, er, ec, s + "U", maze, isVisited);

        // Backtracking
        isVisited[sr][sc] = false;
    }
}