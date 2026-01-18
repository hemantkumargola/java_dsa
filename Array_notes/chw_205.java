// Q2 : Write a JAVA program to find the largest element of a
// given 2D array of integers.

public class chw_205 {

    public static void main(String[] args) {
        int[][] arr = {{1,4,749},{8,7,9},{74,54,65}};
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                mx = Math.max(mx, arr[i][j]);
            }

            
        }
        System.out.println(mx);
    }
}