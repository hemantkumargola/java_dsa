// Q3: Sort a K-Sorted Array (Sort a Nearly Sorted Array)

// Input:
// arr = {6, 5, 3, 2, 8, 10, 9}
// k = 3

// Output:
// {2, 3, 5, 6, 8, 9, 10}
// import java.util.PriorityQueue;
import java.util.*;

public class chw_05 {
  public static void main(String[] args) {
    int[] arr = {6,5,3,2,8,10,9};
    int k = 3;
    PriorityQueue<Integer>  pq  = new PriorityQueue<>();
    List<Integer> ans = new ArrayList<>();
    for(int ele :arr){
      pq.add(ele);
      if(pq.size()>k) ans.add(pq.remove());
    }
    while (pq.size()>k) {
      ans.add(pq.remove());
      
    }
    System.out.println(ans);
  }
  
}
