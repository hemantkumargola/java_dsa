import java.util.Collections;
import java.util.PriorityQueue;

public class chw_02 {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    pq.add(40);
    System.out.println(pq);
    pq.add(10);
    System.out.println(pq);
    pq.add(300);
    System.out.println(pq);
    pq.add(20);
    System.out.println(pq);

  }
}
