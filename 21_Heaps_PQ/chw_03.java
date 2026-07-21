// find the kt smalst in the given array

import java.util.PriorityQueue;

/**
 * chw_03
 */
public class chw_03 {

  public static void main(String[] args) {
      int[] arr = {5,8,7,6,1,0,55,44,6,4,8,7,8,7};
    int k =4;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
  
    for(int ele : arr){
      pq.add(ele);
    }
    for(int i =0;i<k-1;i++){
      pq.remove();
    }
    System.out.println(pq.peek());
  }
}


//time complixity   (nlogn+klongn)