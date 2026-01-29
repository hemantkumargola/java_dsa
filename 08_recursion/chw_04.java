import java.util.Scanner;

public class chw_04 {

    public static void print(int x, int n) {
        if (x > n) return;   // base case

        System.out.println(x);
        print(x + 1, n);     // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1, n);
    }
}
