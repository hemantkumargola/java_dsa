// print stack without inbuulit function

import java.util.Stack;

/**
 * chw_5
 */
public class chw_5 {

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    st.push(60);
    System.out.println(st);


  // Stack<Integer> rt = new Stack<>();
  //   while (st.size()>0) {
    
  //     rt.push(st.pop());
      
  //   }

  //   while (rt.size()>0) {
  //     int x = rt.pop();
  //     System.out.println("without inbulit funcction ");
  //     System.out.print(x + " ");

      
  //   }

  // second methods help arr; 



  int n = st.size();
int[] arr = new int[n];

for (int i = n - 1; i >= 0; i--) {
    arr[i] = st.pop();
}

for (int i = 0; i < n; i++) {
    System.out.print(arr[i] + " ");
    st.push(arr[i]);
}



  }
}