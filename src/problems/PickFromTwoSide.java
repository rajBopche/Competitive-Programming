package problems;

import java.util.ArrayList;

public class PickFromTwoSide {

    public int pickFromTwoSide(ArrayList<Integer> A, int B) {

        int start = 0;
        int end = A.size() - 1;
        int minElementToTake = end - B;
        int totalSum = 0;
        int minSum = 0;
        int currentSum;


        for (int i = start; i <= end; ++i) {
            totalSum += A.get(i);
        }

        for (int i = start; i <= minElementToTake; ++i) {
            minSum += A.get(i);
        }

        ++start;
        ++minElementToTake;
        currentSum = minSum;

        while (minElementToTake != end) {
            currentSum += (A.get(minElementToTake) - A.get(start - 1));
            minSum = Math.min(currentSum, minSum);
            ++start;
            ++minElementToTake;
        }

        return (totalSum - minSum);
    }
}
