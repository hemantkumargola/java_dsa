// basic heap collection test

import java.util.PriorityQueue;

public class cha_01{
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.println(pq);

        System.out.println(pq.remove()); // 10
        System.out.println(pq.remove()); // 20
        System.out.println(pq.remove()); // 30
        System.out.println(pq.remove()); // 40
    }
}