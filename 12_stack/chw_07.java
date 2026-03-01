// implement at stack via linked list
class Node{
  int val;
  Node next;
  Node(int val){
    this.val = val;
  }

}




class Mystack{
Node head;
int len;

int peack(){
   if(head==null){
    System.out.println("stack is empty ");
  return -1;
   }
  else{

return head.val;
  }

}

int pop(){
  if(head==null){
    System.out.println("stack is empty ");
  return -1;

  }
  else{
    int  x  = head.val;
  head = head.next;
  len --;
return x;
  }
}

void push(int ele){
    Node temp = new Node(ele);
    temp.next = head;
    head = temp;
    len++;
}
  

int size(){
  return len;

}
void display(){
  Node temp = head;
  while (temp !=null) {
    System.out.print(temp.val + " ");
    temp = temp.next;
    
  }
  System.out.println();
}
}

public class chw_07 {
  public static void main(String[] args) {
    Mystack st = new Mystack();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
  
    st.display();

    st.pop();

    st.display();
  
    st.push(20);
    st.display();

System.out.println(st.peack());
System.out.println(st.size());

  }
}
