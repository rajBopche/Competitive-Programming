package problems;

import java.util.ArrayList;

public class MaximumSumSubArray {



    public int findAllSubArrayOfArray(ArrayList<Integer> numbers) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxElementSoFar = Integer.MIN_VALUE;

        for (Integer nums : numbers) {
            maxElementSoFar = Math.max(maxElementSoFar, nums);
            if (currentSum + nums > 0) {
                currentSum += nums;
                maxSum = Math.max(currentSum, maxSum);
            } else {
                currentSum = 0;
            }
        }

        if (maxSum <= 0) {
            return maxElementSoFar;
        } else return maxSum;

    }
}
