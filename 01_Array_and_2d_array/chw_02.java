// array input 

import java.util.Scanner;

public class chw_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int[] arr = new int[5];
        // input array 

        for(int i = 0 ; i<5 ; i++){
            arr[i] = sc.nextInt();
        }


        // output loop
        for(int i=0;i<5 ;i++)
            System.out.print(arr[i] + " ");
    }
}