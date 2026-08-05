class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
    }
}
class CircularDoublyLinkedList {

    Node head;
    Node tail;
    int size = 0;

    // Add at Tail
    void add(int val) {

        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
            head.next = head;
            head.prev = head;
        } else {
            temp.prev = tail;
            temp.next = head;

            tail.next = temp;
            head.prev = temp;

            tail = temp;
        }

        size++;
    }

    // Insert At Head
    void insertAtHead(int val) {

        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
            head.next = head;
            head.prev = head;
        } else {

            temp.next = head;
            temp.prev = tail;

            head.prev = temp;
            tail.next = temp;

            head = temp;
        }

        size++;
    }

    // Insert At Index
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
            head.prev = tail;
            tail.next = head;
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
            tail.next = head;
            head.prev = tail;
        }

        size--;
    }

    // Delete At Index
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

    // Display Forward
    void displayForward() {

        if (head == null) {
            System.out.println("List Empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    // Display Backward
    void displayBackward() {

        if (tail == null) {
            System.out.println("List Empty");
            return;
        }

        Node temp = tail;

        do {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        } while (temp != tail);

        System.out.println();
    }

    // Search
    boolean search(int key) {

        if (head == null)
            return false;

        Node temp = head;

        do {

            if (temp.val == key)
                return true;

            temp = temp.next;

        } while (temp != head);

        return false;
    }

    // Size
    int size() {
        return size;
    }
}
public class chw_107 {

    public static void main(String[] args) {

        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Forward");
        list.displayForward();

        System.out.println("Backward");
        list.displayBackward();

        list.insertAtHead(5);
        list.displayForward();

        list.insertAtIndex(3, 25);
        list.displayForward();

        System.out.println(list.get(2));

        list.set(2, 100);
        list.displayForward();

        list.deleteHead();
        list.displayForward();

        list.deleteTail();
        list.displayForward();

        list.deleteAtIndex(2);
        list.displayForward();

        System.out.println(list.search(40));
        System.out.println(list.search(500));

        System.out.println("Size : " + list.size());
    }
}