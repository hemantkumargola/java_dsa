// this file is most most important for dsa 
class Node {
    int val;
    Node prev;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class DoublyLinkedList {

    Node head;
    Node tail;
    int size = 0;

    // Add at Tail
    void add(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    // Insert at Head
    void insertAtHead(int val) {

        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    // Insert at Index
    void insertAtIndex(int index, int val) {

        if (index == 0) {
            insertAtHead(val);
            return;
        }

        if (index == size) {
            add(val);
            return;
        }

        Node curr = head;

        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        Node temp = new Node(val);

        temp.next = curr.next;
        temp.prev = curr;

        curr.next.prev = temp;
        curr.next = temp;

        size++;
    }

    // Get
    int get(int index) {

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    // Set
    void set(int index, int value) {

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        temp.val = value;
    }

    // Delete Head
    void deleteHead() {

        if (head == null)
            return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
    }

    // Delete Tail
    void deleteTail() {

        if (head == null)
            return;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
    }

    // Delete at Index
    void deleteAtIndex(int index) {

        if (index == 0) {
            deleteHead();
            return;
        }

        if (index == size - 1) {
            deleteTail();
            return;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
    }

    // Forward Display
    void displayForward() {
Node temp = head;
      while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();     

     
    }

    // Backward Display
    void displayBackward() {

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Size
    int size() {
        return size;
    }
}

public class chw_105 {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Forward Display");
        list.displayForward();

        System.out.println("Backward Display");
        list.displayBackward();

        System.out.println("Insert At Head");
        list.insertAtHead(5);
        list.displayForward();

        System.out.println("Insert At Index (3,25)");
        list.insertAtIndex(3, 25);
        list.displayForward();

        System.out.println("Get Index 2 : " + list.get(2));

        System.out.println("Set Index 2 = 100");
        list.set(2, 100);
        list.displayForward();

        System.out.println("Delete Head");
        list.deleteHead();
        list.displayForward();

        System.out.println("Delete Tail");
        list.deleteTail();
        list.displayForward();

        System.out.println("Delete Index 2");
        list.deleteAtIndex(2);
        list.displayForward();

        System.out.println("Current Size : " + list.size());
    }
}