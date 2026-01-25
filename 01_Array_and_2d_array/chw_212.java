// Q9 : Write a program to print the matrix in spiral form.
public class chw_212 {
    public static void main(String[] args) {

        int[][] arr = {
            { 1,  2,  3,  4},
            { 5,  6,  7,  8},
            { 9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int minr = 0, maxr = arr.length - 1;
        int minc = 0, maxc = arr[0].length - 1;

        while (minr <= maxr && minc <= maxc) {

            // left to right (top row)
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + " ");
            }
            minr++;

            // top to bottom (right column)
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
            }
            maxc--;

            // right to left (bottom row)
            if (minr <= maxr) {
                for (int j = maxc; j >= minc; j--) {
                    System.out.print(arr[maxr][j] + " ");
                }
                maxr--;
            }

            // bottom to top (left column)
            if (minc <= maxc) {
                for (int i = maxr; i >= minr; i--) {
                    System.out.print(arr[i][minc] + " ");
                }
                minc++;
            }
        }
    }
}
