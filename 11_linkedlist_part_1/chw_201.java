// chw_201.java

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class chw_201 {

    // Function to partition list
    public static ListNode partition(ListNode head, int x) {

        ListNode smallDummy = new ListNode(-1);
        ListNode bigDummy = new ListNode(-1);

        ListNode small = smallDummy;
        ListNode big = bigDummy;

        while (head != null) {

            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                big.next = head;
                big = big.next;
            }

            head = head.next;
        }

        // connect lists
        big.next = null;
        small.next = bigDummy.next;

        return smallDummy.next;
    }

    // helper function to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // create linked list: 1 -> 4 -> 3 -> 2 -> 5 -> 2
        ListNode head = new ListNode(1,
                new ListNode(4,
                new ListNode(3,
                new ListNode(2,
                new ListNode(5,
                new ListNode(2))))));

        int x = 3;

        System.out.println("Original List:");
        printList(head);

        head = partition(head, x);

        System.out.println("Partitioned List:");
        printList(head);
    }
}