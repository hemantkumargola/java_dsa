// puch at bottom recrsivly 
import java.util.Stack;

public class chw_06 {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10); //  bottom 
    st.push(20);
    st.push(30);
    st.push(40);  // top

  System.out.println(st);
recusiveleyrever(st);
System.out.println(st);
   

  }


public static void recusiveleyrever(Stack<Integer> st){
if(st.size()<=1) return;
int top = st.pop();
recusiveleyrever(st);
puschAtbootm(st, top);
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
