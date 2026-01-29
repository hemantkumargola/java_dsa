// print number 

// print number using recursion
import java.util.Scanner;

public class chw_02 {

    public static void print(int n) {
        if (n == 0) return;   // base case

        System.out.println(n);
        print(n - 1);         // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
    