package problems;

import java.util.ArrayList;
import java.util.Collections;

public class MinXorSumValue {

    public int findMinXor(ArrayList<Integer> A) {

        int lastIndex = A.size() - 1;
        int minXorValue = Integer.MAX_VALUE;

        Collections.sort(A);

        for (int i = 0; i < lastIndex; ++i) {
            int x = (A.get(i) ^ A.get(i + 1));
            minXorValue = Math.min(minXorValue, x);
        }

        return minXorValue;
    }
}
