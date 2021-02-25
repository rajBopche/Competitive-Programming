package problems;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {

    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        int lastValidIndex = A.size() - 1;
        for (int i = 0; i < lastValidIndex; i += 2) {
            int temp = A.get(i);
            A.set(i, A.get(i + 1));
            A.set(i + 1, temp);
        }
        return A;
    }

}
