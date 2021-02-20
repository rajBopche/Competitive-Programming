package problems;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrix {

    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> finalResultList = new ArrayList();
        int totalNumberOfRows = A.size();
        int totalNumberOfColumns = A.get(0).size();
        int top = 0, left = 0;
        int bottom = totalNumberOfRows - 1;
        int right = totalNumberOfColumns - 1;
        int direction = 0;

        while (top <= bottom && left <= right) {

            switch (direction) {
                case 0 -> {
                    for (int i = top; i <= right; ++i) finalResultList.add(A.get(top).get(i));
                    ++top;
                    direction = 1;
                }
                case 1 -> {
                    for (int i = top; i <= bottom; ++i) finalResultList.add(A.get(i).get(right));
                    --right;
                    direction = 2;
                }
                case 2 -> {
                    for (int i = right; i >= left; --i) finalResultList.add(A.get(bottom).get(i));
                    --bottom;
                    direction = 3;
                }
                case 3 -> {
                    for (int i = bottom; i >= top; --i) finalResultList.add(A.get(i).get(left));
                    ++left;
                    direction = 0;
                }
            }


        }


        return finalResultList;
    }

}
