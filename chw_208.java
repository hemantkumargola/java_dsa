// Q5 : Write a program to print the transpose of the matrix
// entered by the user and store it in a new matrix.

 public class chw_208 {
 
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6}};
        int  m = arr.length;
        int n = arr[0].length;

        int[][] tran = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tran[i][j] = arr[j][i];
                System.out.print(tran[i][j] + " ");
                
            }
            System.out.println();
            
        }
    }
 }


 