// Q8 : Power function (logarithmic)

import java.util.Scanner;

public class chw_08 {
    public static int pow(int a,int b){
        if(b==0){
            return 1;

        }
        int ans = pow(a, b/2);
      if(b%2==0) return ans *ans;
      else return ans*ans*a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         int result = pow(a,b);
         System.out.println(result);
    }
}