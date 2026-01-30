// Q7 : Make a function which calculates ‘a’ raised to the
// power ‘b’ using recursion.

import java.util.Scanner;

public class chw_07 {
    public static int pow(int a,int b ){
        if(b==0 ){
            return 1;

        }
 
        return a*pow(a,b-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        int b = sc.nextInt();
         int result = pow(a,b);
         System.out.println(result);
    }
}