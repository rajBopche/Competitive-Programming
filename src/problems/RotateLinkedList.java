package problems;

class RotateLinkedList {

    public ListNode rotateRight(ListNode A, int B) {

        if (B == 0) return A;
        if (A == null || A.next == null) return A;
        ListNode temp = A;
        int size = 0;

        while (temp.next != null) {
            ++size;
            temp = temp.next;
        }

        ++size;
        temp.next = A;

        int rotate = B % size;
        temp = A;
        for (int i = 0; i < size - rotate; ++i) {
            temp = temp.next;
        }

        ListNode curr = A;
        while (curr.next != temp) {
            curr = curr.next;
        }

        curr.next = null;
        return temp;
    }

}