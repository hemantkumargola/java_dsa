// implementation in java 


class Sll{
    Node head;
    Node tail;
    int size;
    // insert end me karane ka liye 
    void insertend( int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
          tail = temp;
        }
        size++;
    }
    // insert head me karane ka liye 
     void inserthead( int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head  = temp;
        }
        size++;
    }
    //insert index per karane ka liye 
    void inseridx(int idx , int val){
        if(idx==0){
            inserthead(val);
            return;
        }
        if(idx==size){
         insertend(val);
         return;
        }
        if(idx>size||idx<0){
            System.out.println("index is invalids ");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i =1;i<=idx;i++){
            x =x.next;
        }
        // work ye hai 
        temp.next= x.next;
        x.next = temp;
        size++;
    }
    // list me elemnt ko get karane ka liye 
    int get(int idx){
        if(idx==size-1) return tail.val;
        if(idx>size || idx <0) return -1;
        
        Node temp = head;
        for(int i =0;i<idx;i++){
         temp = temp.next;
        }
        return temp.val;

    }
       // list me elemnt ko set karane ka liye 
    void set(int idx , int vals){
        if(idx==size-1){
            tail.val = vals;
        }
        if(idx>size || idx <0) ;
        
        Node temp = head;
        for(int i =0;i<idx;i++){
         temp = temp.next;
        }
        temp.val = vals;

    }

//delte at head karane ka liye 
void deltehead(){
    if(head == null ){
        System.out.println("list is empty");
    }
        head = head.next;
        size--;
    
}

// index se delete karane ka liye 
void deleteidx(int idx ){
    Node temp = head;
    for(int i =0;i<idx-1;i++){
        temp = temp.next;
    }
    if(temp.next==tail) tail = temp;
    temp.next = temp.next.next;
    size--;
}

// list ko print karane ka liye 

    void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
            
        }
        System.out.println();
    }
    //  size fo print karane ka liye 
    void size(){
        System.out.println(size);
    }


}
 

public class chw_04 {

    public static void main(String[] args) {
        Sll list = new Sll();
        list.insertend(100);
        list.insertend(20);
        list.insertend(30);
        list.insertend(40);
        list.insertend(50);
        list.display();
        list.insertend(50);
        list.display();
       list.size();
       System.out.println(list.size);
       list.inserthead(98);
       list.inserthead(87);
       list.display();
       list.size();
       list.inseridx(2, 99999);
       list.display();
       System.out.println(list.get(2));
       System.out.println();
       list.set(2, 6565);
       list.display();
       list.deltehead();
       list.display();
       list.deleteidx(3);
       list.display();
        
    }
}