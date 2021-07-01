package problems;

public class LinkedListIntersection {

    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        if (a == null || b == null) return null;

        ListNode aTemp = a;
        ListNode bTemp = b;

        while (aTemp != bTemp) {
            aTemp = (aTemp == null) ? b : aTemp.next;
            bTemp = (bTemp == null) ? a : bTemp.next;
        }

        return aTemp;
    }
}
