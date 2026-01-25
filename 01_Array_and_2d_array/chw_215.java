// Q14 : Given an m x n integer matrix matrix, if an element is
// 0, set its entire row and column to 0's.

public class chw_215 {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        int m = arr.length;
        int n = arr[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        // Step 1: Check first row
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                firstRow = true;
                break;
            }
        }

        // Step 2: Check first column
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                firstCol = true;
                break;
            }
        }

        // Step 3: Use first row & column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // Step 4: Update matrix
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        // Step 5: Zero first row
        if (firstRow) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        // Step 6: Zero first column
        if (firstCol) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }

        // Print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
