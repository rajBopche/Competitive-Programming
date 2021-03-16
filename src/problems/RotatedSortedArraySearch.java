package problems;

import java.util.List;

public class RotatedSortedArraySearch {

    public int search(final List<Integer> A, int B) {

        int low = 0;
        int high = A.size() - 1;
        int mid = 0;

        while (low <= high) {

            mid = (low + (high - low) / 2);

            if (B == A.get(mid)) return mid;

            if (A.get(mid).intValue() >= A.get(low).intValue()) {
                if (B >= A.get(low) && B < A.get(mid)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (B <= A.get(high) && B > A.get(mid)) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

}
