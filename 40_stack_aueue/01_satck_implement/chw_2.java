/// stack ka input lane ka liye 

import java.util.Scanner;
import java.util.Stack;

public class chw_2 {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    System.out.println("enter the number ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("enetr the elemets ");
    for(int i =0;i<n;i++){
      int m = sc.nextInt();
      st.push(m);
    }
    System.out.println(st);
  }
}
