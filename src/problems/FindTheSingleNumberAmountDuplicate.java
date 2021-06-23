package problems;

import java.util.List;

public class FindTheSingleNumberAmountDuplicate {

    public int singleNumber(final List<Integer> A) {
        int singleNum = 0;

        for (Integer num : A) {
            singleNum = singleNum ^ num;
        }

        return singleNum;
    }

}
