// Q6 : Input a string and toggle all the characters of it.
// (Replace small case with capital case & vice versa)

import java.util.Scanner;

public class chw_205 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int assi = (int) ch;

            if (assi >= 65 && assi <= 90) {
                assi += 32;
              
            } else if (assi >= 97 && assi <= 122) {

                assi -= 32;
            
            }
                ch = (char) assi;
                s.setCharAt(i, ch);

        }
        System.out.println(s);
    }
}