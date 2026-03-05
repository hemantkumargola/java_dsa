// implementtaion  queue by LinkedList 
class Node {
  int val;
  Node Next;
  Node(int val){
    this.val = val;
  }
}

public class chw_05{
  Node head;
  Node tail;
  int size;

// peek function 
int peek(){
  if(size==0){
    System.out.println("queue is emprty ");
    return-1;
}
  return head.val;

}
  // removed ka function 
  int removes(){
    if(size==0){
      System.out.println("queue is empty ");
      return -1;
    }
    int font  = head.val;
    head = head.Next;
    size--;
    return font;
  }

// void add ka function 
  void add(int val){
    Node temp = new Node(val);
    if(tail==null) head = tail = temp;
    else{
      tail.Next = temp;
      tail = temp;
    }
    size++;

  }
  //void display
  void display(){
    Node  temp = head;
    while (temp!=null) {
      System.out.print(temp.val+ " ");
      temp = temp.Next;
      
    }
    System.out.println();
  }

  public static void main(String[] args) {
    chw_05 q = new chw_05();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add( 40);
    q.display();
    q.removes();
    q.display();
    System.out.println(q.peek());
    q.display();
    System.out.println(q.removes());
    q.display();


  }}