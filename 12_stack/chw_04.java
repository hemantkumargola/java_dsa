import java.util.Stack;

public class chw_04 {
  public static void main(String[] args) {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);

    System.out.println("Original Stack: " + st);

    int idx = 2;  

    int n = st.size();

    // Move top elements until target index reaches top
    while (st.size() > n - idx - 1) {
        st2.push(st.pop());
    }

    // Remove target element   // element me push karana ho  to yaha kar dege like this 
    st.pop();

    // Put elements back
    while (!st2.isEmpty()) {
        st.push(st2.pop());
    }

    System.out.println("After Removal: " + st);
  }
}