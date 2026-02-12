
// ListNode class
class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

class Solution {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode dummy = new ListNode(-1);
    ListNode temp = dummy;

    while (list1 != null && list2 != null) {

      if (list1.val <= list2.val) {
        temp.next = list1;
        list1 = list1.next;
      } else {
        temp.next = list2;
        list2 = list2.next;
      }

      temp = temp.next;
    }

    if (list1 != null)
      temp.next = list1;
    else
      temp.next = list2;

    return dummy.next;
  }
}

public class chw_09 {

  // helper to create list
  static ListNode create(int[] arr) {
    ListNode dummy = new ListNode(-1);
    ListNode temp = dummy;

    for (int num : arr) {
      temp.next = new ListNode(num);
      temp = temp.next;
    }

    return dummy.next;
  }

  // helper to print list
  static void print(ListNode head) {
    while (head != null) {
      System.out.print(head.val + " -> ");
      head = head.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {

    int[] a = { 1, 2, 4 };
    int[] b = { 1, 3, 4 };

    ListNode l1 = create(a);
    ListNode l2 = create(b);

    Solution sol = new Solution();

    ListNode result = sol.mergeTwoLists(l1, l2);

    print(result);
  }
}
