// Q4 : Print 1 to n (after recursive call)

import java.util.Scanner;

public class chw_05 {
public static void print(int n){
    if(n==0) return;  // bace coll 
    print(n-1);    // coll 
    System.out.println(n);  // work 

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
