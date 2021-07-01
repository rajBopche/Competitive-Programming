package problems;

public class SortBinaryLinkedList {
    public ListNode sort(ListNode A) {

        if (A == null || A.next == null) return A;

        int zeros = 0;
        ListNode temp = A;

        while (temp != null) {
            if (temp.val == 0) {
                temp.val = 1;
                ++zeros;
            }
            temp = temp.next;
        }

        temp = A;
        for (int i = 0; i < zeros; ++i) {
            temp.val = 0;
            temp = temp.next;
        }
        return A;
    }
}
