// Q1 : Input a string and count all the vowels in the given
// string.

import java.util.Scanner;

public class chw_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

        }
        System.out.println(count);
    }
}