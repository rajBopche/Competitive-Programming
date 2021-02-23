package problems;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {

    public int maxArr(ArrayList<Integer> A) {

        int maxSum1 = Integer.MIN_VALUE;
        int maxSum2 = Integer.MIN_VALUE;
        int minSum1 = Integer.MAX_VALUE;
        int minSum2 = Integer.MAX_VALUE;

        for (int i = 0; i < A.size(); ++i) {
            maxSum1 = Math.max(maxSum1, A.get(i) + i);
            maxSum2 = Math.max(maxSum2, A.get(i) - i);
            minSum1 = Math.min(minSum1, A.get(i) + i);
            minSum2 = Math.min(minSum2, A.get(i) - i);
        }

        return Math.max(maxSum1 - minSum1, maxSum2 - minSum2);
    }

}
