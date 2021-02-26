package problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LargestNumberWithAllArrayElements {

    public String largestNumber(final List<Integer> A) {

        ArrayList<String> stringNumberList = new ArrayList();

        for (int i = 0; i < A.size(); ++i) {
            stringNumberList.add(i, A.get(i).toString());
        }

        Comparator<String> comparator = (str1, str2) -> {
            if ((str1 + str2).compareTo(str2 + str1) > 0)
                return -1;
            else return 1;
        };

        stringNumberList.sort(comparator);
        StringBuilder output = new StringBuilder();
        for (String element : stringNumberList) {
            output.append(element);
        }

        if (output.charAt(0) == '0') return "0";
        return output.toString();

    }
}
