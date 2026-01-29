// Q1 : Make a function which calculates the factorial of n
// using recursion.
import java.util.Scanner;

public class chw_01 {
    public static int fact(int n ){
        if(n==1) return 1;   // base case 
        return n *(n-1);  // call 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}