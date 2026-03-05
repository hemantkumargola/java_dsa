// traversiling queues 

import java.util.LinkedList;
import java.util.Queue;

public class chw_02 {
  private static void display(Queue<Integer> q){
 int n = q.size();
    for(int i =0;i<n;i++){
      System.out.print(q.peek() + " ");
      q.add(q.remove());
    }
  }

  public static void main(String[] args) {
    Queue<Integer> q =  new LinkedList<>();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.add(50);
     display(q);
     System.out.println();
     addAtindex(q, 2, 100);
     System.out.println();
     display(q);
     System.out.println();
     System.out.println(peek(q, 02));
     
     System.out.println();
     System.out.println(remove(q, 05));
  }

  private static void addAtindex(Queue<Integer> q , int idx ,int val ){
   if(idx <0 || idx >q.size()){
    System.out.println("invalid");
    return;

   }
   int n = q.size();
   if(idx<n){
    for(int i =1;i<=idx;i++){
      q.add(q.remove());
    }
    q.add(val);
    for(int i=1;i<=n-idx;i++){
      q.add(q.remove());
    }
   }
  }



  // peack ka liye 
  private static int peek(Queue<Integer> q ,int idx ){
    
    int n = q.size();
    int ans = -1;

    for (int i = 0; i < n; i++) {

      int x = q.remove();

      if (i == idx) ans = x;

      q.add(x);
    }

    return ans;
  }
  // remove ka liyye 
  private static int remove(Queue<Integer> q, int idx){
    int n = q.size();
    int removed = -1;

    for (int i = 0; i < n; i++) {

      int x = q.remove();

      if (i == idx) {
        removed = x;
      } else {
        q.add(x);
      }
    }

    return removed;
  }
  }