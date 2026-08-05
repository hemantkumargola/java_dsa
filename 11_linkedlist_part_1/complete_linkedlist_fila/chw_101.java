import java.util.LinkedList;
// dsa me not use only project me 
public class chw_101 {
    public static void main(String[] args) {

        // Integer type ka LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Elements add karna
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // First aur Last me add karna
        list.addFirst(5);
        list.addLast(50);

        // List print
        System.out.println("LinkedList: " + list);

        // First aur Last element
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        // Remove first aur last
        list.removeFirst();
        list.removeLast();

        System.out.println("After Remove: " + list);

        // Size
        System.out.println("Size: " + list.size());
    }
}