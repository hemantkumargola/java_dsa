import java.util.Stack;

public class chw_01 {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    System.out.println(st.size());
    System.out.println(st);
    st.pop();
    System.out.println(st+ " "+ st.size());
    System.out.println(st.peek());
    System.out.println(st.pop());  // it return  the most elemnt  and then remove it 
    
  }
  
}
