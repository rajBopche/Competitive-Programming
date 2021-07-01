package problems;


class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode A) {

        if (A == null || A.next == null) return A;

        ListNode current = A;
        ListNode prev = null;
        ListNode next;

        while (current.next != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        current.next = prev;
        return current;
    }
}

