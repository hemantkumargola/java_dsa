// // Q3 : Write a program to print sum of all the elements of a
// 2D matrix.

public class chw_206 {

    public static void main(String[] args) {
         int[][] arr = {{1,4,749},{8,7,9},{74,54,65}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }

        }
        System.out.println(sum);
    }
}