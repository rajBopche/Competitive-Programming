package problems;

import java.util.ArrayList;

public class MinStepsInfiniteGrid {

    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {


        int minSteps = 0;

        for (int i = 0; i < (B.size() - 1); ++i) {
            minSteps += calculateMinSteps(i, A, B);
        }

        return minSteps;

    }

    private int calculateMinSteps(int counter, ArrayList<Integer> A, ArrayList<Integer> B) {

        int currentX;
        int currentY;
        int nextX;
        int nextY;

        currentX = A.get(counter);
        currentY = B.get(counter);
        nextX = A.get(counter + 1);
        nextY = B.get(counter + 1);

        int xDiff = java.lang.Math.abs(nextX - currentX);
        int yDiff = java.lang.Math.abs(nextY - currentY);

        return Math.max(xDiff, yDiff);
    }

}
