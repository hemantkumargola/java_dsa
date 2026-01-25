// //  Q7 : Reverse each word in a given sentence.
// (Ex : i am raghav garg -> i ma vahgar grag) 

import java.util.Scanner;

public class chw_206 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
         int i =0;
         int j =0;
         while (j<n) {
            if(sb.charAt(j)!=' ')j++;
           
           else{
            Reverse(sb ,i ,j-1);
            i=j+1;
            j=i;
           }

        }
        Reverse(sb , i , j-1);
        System.out.println(sb);
    }
           public static void Reverse(StringBuilder sb ,int i ,int j){
            while(i<=j){
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;

            }
           }
    
}