// Q5 : Print sum from 1 to n (Parameterised)

import java.util.Scanner;


// public class chw_06 {
//     public static int sum(int n ){
    
//         if(n==0) { 
//             return 0;
//         }
       
//        return n + sum(n-1);
//         }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         // int s = sum(n);
//         System.out.println(sum(n));
   
//     }

// }


// second methods 
public class chw_06 {
    public static void sum(int n ,int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        sum(n-1, s+n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n,0);
    }
}