// Q4 : Return the total number of digits in a number without
// using any loop.
// Hint : Try using inbuilt Integer.toString() function.

import java.util.Scanner;

public class chw_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = ""+ n;
        int len = s.length();
        System.out.println(len);
    }
}
