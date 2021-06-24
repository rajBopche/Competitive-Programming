package problems;

import java.util.ArrayList;
import java.util.Collections;

class PairWithDifference {

    public int findIfPairExist(ArrayList<Integer> A, int B) {

        Collections.sort(A);

        for (Integer num : A) {
            int target = num + B;
            boolean isPresent = binarySearchForTarget(A, target);
            if (isPresent) return 1;
        }
        return 0;
    }

    private boolean binarySearchForTarget(ArrayList<Integer> a, int target) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midElement = a.get(mid);
            if (midElement == target)
                return true;

            if (midElement < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}