// ListNode class (must for VS Code)
class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }
}

class Solution {

  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null)
      return head;

    ListNode slow = head, fast = head, prev = null;

    // find middle
    while (fast != null && fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }

    prev.next = null;

    ListNode left = sortList(head);
    ListNode right = sortList(slow);

    return merge(left, right);
  }

  private ListNode merge(ListNode l1, ListNode l2) {

    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;

    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        curr.next = l1;
        l1 = l1.next;
      } else {
        curr.next = l2;
        l2 = l2.next;
      }
      curr = curr.next;
    }

    if (l1 != null)
      curr.next = l1;
    if (l2 != null)
      curr.next = l2;

    return dummy.next;
  }
}

public class chw_07 {

  // helper to print list
  static void print(ListNode head) {
    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }
  }

  public static void main(String[] args) {

    // create list: 4 -> 2 -> 1 -> 3
    ListNode head = new ListNode(4);
    head.next = new ListNode(2);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(3);

    Solution s = new Solution();

    head = s.sortList(head);

    print(head); // Output: 1 2 3 4
  }
}
