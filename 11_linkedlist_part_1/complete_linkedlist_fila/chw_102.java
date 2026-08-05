import java.util.LinkedList;
import java.util.Iterator;
// dsa me not use only project me 
public class chw_102 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Forward Print
        System.out.print("Forward: ");
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Backward Print
        System.out.print("Backward: ");
        Iterator<Integer> it = list.descendingIterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}