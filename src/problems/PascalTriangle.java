package problems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<? extends List<Integer>> pascalTriangle(int rows) {

        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        if (rows <= 0) return output;

        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        output.add(firstRow);
        if (rows == 1) return output;

        ArrayList<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        output.add(secondRow);
        if (rows == 2) return output;

        for (int i = 2; i < rows; ++i) {
            ArrayList<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j <= (i - 1); ++j) {
                int sum = output.get(i - 1).get(j - 1) + output.get(i - 1).get(j);
                newRow.add(sum);
            }
            newRow.add(1);
            output.add(newRow);
        }

        return output;
    }
}
