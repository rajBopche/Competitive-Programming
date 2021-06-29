package problems;

import java.util.ArrayList;

public class MergeProcedure {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {

        int aSize = a.size();
        int bSize = b.size();

        if (b.size() == 0) return;
        if (a.size() == 0) {
            a.addAll(b);
            return;
        }


        ArrayList<Integer> temp = new ArrayList();
        int i = 0, j = 0;

        while (i < aSize && j < bSize) {
            Integer aNum = a.get(i);
            Integer bNum = b.get(j);
            if (aNum < bNum) {
                temp.add(aNum);
                ++i;
            } else if (aNum > bNum) {
                temp.add(bNum);
                ++j;
            } else {
                temp.add(aNum);
                temp.add(bNum);
                ++i;
                ++j;
            }
        }

        if (i <= aSize) {
            //j ended first; from j to b.end() append all
            temp.addAll(a.subList(i, aSize));
        }

        if (j <= bSize) {
            //i ended first; from i to a.end() append all
            temp.addAll(b.subList(j, bSize));
        }

        a.clear();
        a.addAll(temp);
    }
}

