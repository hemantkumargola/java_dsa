// hcf calculate 

import java.util.Scanner;

public class chw_19 {
    public static int gfc(int a ,int b ){
        if(b%a==0) return a;
        return  gfc(b%a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gfc(a,b));
    }
}