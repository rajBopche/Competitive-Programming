package problems;

import java.util.ArrayList;

public class RemoveDuplicateFromSortedArray {

    public int removeDuplicates(ArrayList<Integer> a) {

        if (a.size() == 0) return 0;

        for (int i = 0; i < a.size() - 1; ++i) {
            if (a.get(i).equals(a.get(i + 1))) {
                int lastIndexForDuplicate = binarySearch(a, a.get(i));
                a.subList(i + 1, lastIndexForDuplicate + 1).clear();
            }
        }

        return a.size();
    }

    public int binarySearch(ArrayList<Integer> a, int target) {
        int low = 0;
        int high = a.size() - 1;
        int rInd = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int num = a.get(mid);
            if (num == target) {
                rInd = mid;
                low = mid + 1;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return rInd;
    }
}
