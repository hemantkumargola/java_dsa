class Node {
  int val;
  Node next;

  Node(int val) {
    this.val = val;
  }
}

class sll {
  Node head;
  Node tail;
  int size;

  // end me inseart karane ka liye
  void insertAtEnd(int val) {
    Node temp = new Node(val);
    if (head == null)
      head = tail = temp;
    else {
      tail.next = temp;
      tail = temp;
    }
    size++;
  }

  // star me inserat karane ka liye
  void insertAtstar(int val) {
    Node temp = new Node(val);
    if (head == null)
      head = tail = temp;
    else {
      temp.next = head;
      head = temp;
    }
    size++;
  }

  // value insert karana

  void insert(int idx, int val) {
    Node temp = new Node(val);
    Node x = head;
    for (int i = 0; i <= idx; i++) {
      x = x.next;

    }
    temp.next = x.next;
    x.next = temp;
    size++;
  }

  // get element
  int get(int idx) {
    if (idx == size - 1)
      return tail.val;
    if (idx >= size || idx < 0) {
      System.out.println("inved");
      return -1;
    }
    Node temp = head;
    for (int i = 1; i <= idx; i++) {
      temp = temp.next;
    }
    return temp.val;
  }

  // set ka code hai
  void set(int idx, int val) throws Error {
    if (idx == size - 1)
      tail.val = val;
    if (idx >= size || idx < 0) {
      throw new Error("erro");
    }

    Node temp = head;
    for (int i = 1; i <= idx; i++) {
      temp = temp.next;
    }
    temp.val = val;
  }

  // head me delete krane kaliye
  void deltethead() throws Error {
    if (head == null)
      throw new Error("list is empty");
    head = head.next;
    size--;
  }

  // kise bhi delete karane se
  void delete(int idx) throws Error {
    if (head == null)
      throw new Error("ivaled ");
    if (idx < 0 || idx >= size)
      throw new Error("inved inde");
    Node temp = head;
    for (int i = 1; i <= idx - 1; i++) {
      temp = temp.next;
    }
    temp.next = temp.next.next;
    size--;
  }

  // diplay ka code
  void diplay() {

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }

  }

}

public class chw_05 {

  public static void main(String[] args) {
    sll ll = new sll();
    ll.insertAtEnd(0);
    ll.insertAtEnd(10);
    ll.insertAtEnd(20);
    ll.insertAtEnd(30);
    ll.insertAtEnd(40);
    ll.diplay();
    System.out.println();
    System.out.println(ll.size);
    ll.insertAtstar(21);

    ll.insertAtEnd(30);
    ll.diplay();

    ll.insert(4, 1000000);
    ll.diplay();
    System.out.println();
    System.out.println(ll.get(2));
    System.out.println(ll.get(3));

    ll.set(1, 50505050);
    ll.diplay();
    System.out.println();
    ll.deltethead();
    ll.diplay();
    System.out.println();
    ll.delete(4);
    ll.diplay();
  }
}