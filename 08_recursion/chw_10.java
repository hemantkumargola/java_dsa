// Q3 : Stair Path

import java.util.Scanner;

public class chw_10 {
    public static int star(int n ){
    if(n<=2){
        return n;

    }
    return star(n-1) +star(n-2);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(star(n));
    }
}