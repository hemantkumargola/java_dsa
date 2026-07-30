public class chw_102 {
//recusion 
    public static void main(String[] args) {
        int row = 3;
        int col = 3;

        mazepath(1, 1, row, col, "");
    }

    private static void mazepath(int sr, int sc, int er, int ec, String s) {

        // Out of boundary
        if (sr > er || sc > ec)
            return;

        // Destination reached
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        // Move Down
        mazepath(sr + 1, sc, er, ec, s + "d");

        // Move Right
        mazepath(sr, sc + 1, er, ec, s + "r");
    }
}