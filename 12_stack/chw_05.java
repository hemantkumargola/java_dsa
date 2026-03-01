// puch at bottom recrsivly 
import java.util.Stack;

public class chw_05 {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10); //  bottom 
    st.push(20);
    st.push(30);
    st.push(40);  // top

  System.out.println(st);
  int ele = 50;
  puschAtbootm(st, ele);
System.out.println(st);
   

  }

  public static void puschAtbootm(Stack<Integer> st , int ele){
    if(st.size()==0) {

      st.push(ele);
      return;
    }
    int top = st.pop();
    puschAtbootm(st, ele);
    st.push(top);

  }
}
