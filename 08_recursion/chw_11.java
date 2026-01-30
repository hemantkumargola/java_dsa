// maze path 

import java.util.Scanner;

public class chw_11 {
    public static int maze(int row,int col ,int m ,int n){
        if(row==m|| col==n) return 1;
        int rightway = maze(row,col+1,m,n);
        int doenway = maze(row+1, col, m, n);
        return  rightway + doenway;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(maze(1,1,m,n));
        
    }
}