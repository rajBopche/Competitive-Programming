package problems;

import java.awt.*;
import java.util.ArrayList;

public class SetMatrixZeroes {


    int totalRows;
    int totalColumns;
    ArrayList<Point> zeroPositions = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> setZeroes(ArrayList<ArrayList<Integer>> a) {
        totalRows = a.size();
        totalColumns = a.get(0).size();

        for (int i = 0; i < totalRows; ++i) {
            for (int j = 0; j < totalColumns; ++j) {
                if (a.get(i).get(j) == 0) {
                    zeroPositions.add(new Point(i, j));
                }
            }
        }


        for (Point point : zeroPositions) {
            setRowAndColumnZero(a, point.x, point.y);
        }

        return a;
    }

    public void setRowAndColumnZero(ArrayList<ArrayList<Integer>> a, int row, int column) {
        //set all elements zero row wise
        for (int j = 0; j < totalColumns; ++j) {
            a.get(row).set(j, 0);
        }

        //set all elements zero column wise
        for (int i = 0; i < totalRows; ++i) {
            a.get(i).set(column, 0);
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
        ArrayList<Integer> element1 = new ArrayList<>();
        element1.add(0);
        element1.add(0);
        ArrayList<Integer> element2 = new ArrayList<>();
        element2.add(1);
        element2.add(1);
        nums.add(element1);
        nums.add(element2);
        new SetMatrixZeroes().setZeroes(nums);
    }


}
