package problems;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {


    public int solve(ArrayList<Integer> A) {

        Collections.sort(A);
        int lastValidIndex = A.size() - 1;
        if (A.get(lastValidIndex) == 0) return 1;
        for (int i = 0; i < A.size() - 1; ++i) {
            int value = A.get(i);
            int remainingElements = lastValidIndex - i;
            if (!A.get(i).equals(A.get(i + 1)) && value == remainingElements) return 1;
        }

        return -1;

    }
}
