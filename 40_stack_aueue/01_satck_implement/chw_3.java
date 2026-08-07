// copy content one stack to second stack in java 

import java.util.Stack;

public class chw_3 {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6);
    System.out.println(st);


    // reverse order  karane ka liye hai 
    Stack<Integer> rt  = new Stack<>();

    while (st.size()>0) {
      int x =st.peek();
      rt.push(x);
      st.pop();
      

      
    }
    System.out.println(rt);

  }
}
