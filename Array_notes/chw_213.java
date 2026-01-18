// array list 2dimention 

import java.util.ArrayList;
import java.util.List;

public class chw_213 {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(100); b.add(200); b.add(40);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(2000);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c);l.add(d);

        // for (int i = 0; i < l.size(); i++) {
        //     System.out.println(l.get(i));
            
        // }
        
        // only print 200
        // System.out.println(l.get(1).get(1));


        // second methods
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j)+ " ");
                
            }
            System.out.println();
        }


    }
}