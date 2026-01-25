// Q1 : Write a program to store roll number and marks
// obtained by 4 students side by side in a matrix.

import java.util.Scanner;

public class chw_204 {

    public static void main(String[] args) {
        int[][] arr = new int[4][2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
                
            }
            
        }
        // print 
          for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
                System.out.println();
        }
      
    }
}