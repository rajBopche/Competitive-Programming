package problems;

import java.util.ArrayList;

public class MaxSubset {

    public ArrayList<Integer> maxset(ArrayList<Integer> A) {

        long currentSubsetSum = 0L;
        long maxSubsetSum = 0L;
        ArrayList<Integer> currentSubset = new ArrayList<Integer>();
        ArrayList<Integer> maxSubset = new ArrayList<Integer>();

        for (Integer number : A) {

            if (number >= 0) {
                //number is positive
                currentSubsetSum += number;
                currentSubset.add(number);

            } else {
                //number is negative
                currentSubset.clear();
                currentSubsetSum = 0;
            }

            if ((maxSubsetSum < currentSubsetSum) || ((maxSubsetSum == currentSubsetSum) && (maxSubset.size() < currentSubset.size()))) {
                maxSubsetSum = currentSubsetSum;
                maxSubset.clear();
                maxSubset.addAll(currentSubset);
            }
        }

        return maxSubset;
    }
}

