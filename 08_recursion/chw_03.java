// print number 

// print number using recursion  incresing me 
import java.util.Scanner;

public class chw_03 {
    static int n ;

    public static void print(int x) {
        if (x>n) return;   // base case

        System.out.println(x);
        print(x + 1);         // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        print(1);
    }
}
    