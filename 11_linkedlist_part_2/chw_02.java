class Node2 {
    int val;
    Node2 next;
    Node2 prev;

    Node2(int val) {
        this.val = val;
    }
}

public class chw_02 {

    static class DLL {  
        Node2 head;
        Node2 tail;
        int size;

        void display() {
            Node2 temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // insert at tail 
        void insertAttail(int val){
          Node2 temp = new Node2(val);
          if(size ==0) head = tail = temp;
          else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;

          }
          size++;
        }

        // insert athead
            void insertAthead(int val){
          Node2 temp = new Node2(val);
          if(size ==0) head = tail = temp;
          else{
           temp.next = head;
           head.prev = temp;
           head = temp;

          }
          size++;
        }

        // delete at head
        void deleteAtHead() {

    if (size == 0) {
        System.out.println("List is Empty");
        return;
    }

    if (size == 1) {
        head = tail = null;
    } 
    else {
        head = head.next;
        head.prev = null;
    }

    size--;
}

//delete at tail
void deleteAtTail() {

    if (size == 0) {
        System.out.println("List is Empty");
        return;
    }

    if (size == 1) {
        head = tail = null;
    } 
    else {
        tail = tail.prev;
        tail.next = null;
    }

    size--;
}

        // idx me insert the value 
        void insert( int idx , int val){
            if(idx ==0){
                insertAthead(val);
                return;
            }
            if(idx == size){
                insertAttail(val);
                return;
            }
            if(idx>size || idx <0){
                System.out.println("invaled ");
                return;
            }
            Node2 temp = new Node2(val);
            Node2 x = head;
           for(int i =1 ;i<=idx-1;i++){
            x=x.next;
           }
           Node2 y = x.next;
           x.next = temp; temp.prev =x;
           y.prev = temp ; temp.next = y;
           size++;
        }


        // index se delete karane ka liye 
        void delete(int idx) {

    if (idx < 0 || idx >= size) {
        System.out.println("invalid");
        return;
    }

    // delete head
    if (idx == 0) {
    deleteAtHead();
        size--;
        return;
    }

    // delete tail
    if (idx == size - 1) {
     deleteAtTail();
     size--;
        return;
    }

    // delete from middle
    Node2 x = head;

    for (int i = 1; i <= idx; i++) {
        x = x.next;
    }

    Node2 prevNode = x.prev;
    Node2 nextNode = x.next;

    prevNode.next = nextNode;
    nextNode.prev = prevNode;

    size--;
}

    }

    public static void main(String[] args) {
        DLL list = new DLL();
     list.insertAttail(10);
      list.insertAttail(20);
       list.insertAttail(30);
       list.display();
       list.insertAthead(300);
       list.insertAthead(500);
       list.display();
       System.out.println();
       list.insert(2, 200000);
      list.display();

       
    }
}


// get set  idx file next 