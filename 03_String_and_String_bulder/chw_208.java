// Q9 : Given n strings consisting of lowercase English
// alphabets. Print the character that is occurring most
// number of times.

import java.util.Scanner;

public class chw_208 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.next();
        int[] freq =  new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int indx = (int)ch-97;
            freq[indx]++;

            
        }
        int mx = -1;
        for (int i = 0; i < freq.length; i++) {
            mx =Math.max(mx, freq[i]);

            
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] == mx){
                char ch = (char)(i+97);
                System.out.print(ch+" ");
            }
               
        }
    }
}