package problems;

import java.util.ArrayList;

public class ContainerWithMostWater {

    public int maxArea(ArrayList<Integer> A) {

        int aSize = A.size();
        if (aSize == 0 || aSize == 1) return 0;

        int i = 0;
        int j = aSize - 1;
        int maxArea = -1;

        while (i < j) {
            int iElem = A.get(i);
            int jElem = A.get(j);

            //find the area with current elements
            int diff = j - i;
            int tempArea = diff * Math.min(iElem, jElem);
            maxArea = Math.max(tempArea, maxArea);

            //increment the pointer of smaller element
            if (iElem > jElem) --j;
            else if (jElem > iElem) ++i;
            else ++i;
        }

        return maxArea;
    }

}
