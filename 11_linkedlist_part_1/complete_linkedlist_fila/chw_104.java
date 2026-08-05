import java.util.LinkedList;
import java.util.ListIterator;
// dsa me not use only project me 
public class chw_104 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ListIterator<Integer> it = list.listIterator();

        // Forward (Next)
        System.out.println("Forward:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Backward (Previous)
        System.out.println("Backward:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}