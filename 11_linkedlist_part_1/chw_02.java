// methods two 

import java.util.LinkedList;

public class chw_02 {
  public static void main(String[] args) {

    LinkedList<Integer> list = new LinkedList<>();

    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println(list);

    list.removeFirst();
    System.out.println(list);
  }
}
// Method Work
// add() insert
// addFirst() insert at start
// addLast() insert at end
// remove() delete
// get(i) access element
// size() length