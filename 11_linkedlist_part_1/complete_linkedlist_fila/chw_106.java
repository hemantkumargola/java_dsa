// Circular Singly Linked List

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class CircularSinglyLinkedList {

    Node head;
    Node tail;
    int size = 0;

    // Add at Tail
    void add(int val) {

        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
            tail.next = head;
        } else {
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }

        size++;
    }

    // Insert at Head
    void insertAtHead(int val) {

        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
            tail.next = head;
        } else {
            temp.next = head;
            head = temp;
            tail.next = head;
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

            Node temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            tail = temp;
            tail.next = head;
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

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        size--;
    }

    // Display
    void display() {

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

public class chw_106 {

    public static void main(String[] args) {

        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Display");
        list.display();

        // Insert At Head
        System.out.println("Insert At Head");
        list.insertAtHead(5);
        list.display();

        // Insert At Index
        System.out.println("Insert At Index (3,25)");
        list.insertAtIndex(3, 25);
        list.display();

        // Get
        System.out.println("Get Index 2 : " + list.get(2));

        // Set
        System.out.println("Set Index 2 = 100");
        list.set(2, 100);
        list.display();

        // Delete Head
        System.out.println("Delete Head");
        list.deleteHead();
        list.display();

        // Delete Tail
        System.out.println("Delete Tail");
        list.deleteTail();
        list.display();

        // Delete At Index
        System.out.println("Delete Index 2");
        list.deleteAtIndex(2);
        list.display();

        // Search
        System.out.println("Search 40 : " + list.search(40));
        System.out.println("Search 500 : " + list.search(500));

        // Size
        System.out.println("Current Size : " + list.size());
    }
}