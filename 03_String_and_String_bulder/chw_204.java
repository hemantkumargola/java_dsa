// stringbulder ka input kase lete hai 

import java.util.Scanner;

public class chw_204 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // first methods 
        //     String s = sc.nextLine();
        //   StringBuilder sb = new StringBuilder(s);

        // seconnd methods 
        StringBuilder sb = new StringBuilder(sc.nextLine());
          System.out.println(sb);

          //setcharAt()
          sb.setCharAt(1,'z');
          System.out.println(sb);
    }
}