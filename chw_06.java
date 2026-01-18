// 

import java.util.Scanner;

public class chw_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the targate elements ");
        int x = sc.nextInt();
        System.out.println("size of array in array ");
        int n = sc.nextInt();
        System.out.println("enter the element ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // targate
        boolean flag = false;
        for (int i = 0; i < n; i++) {

            if (arr[i] == x)
                flag = true;
            break;

        }

        if (flag) {

            System.out.println("element fount");
        } else {
            System.out.println("not found");
        }

    }
}