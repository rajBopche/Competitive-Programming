package problems;

public class CountBit1 {

    public int numSetBits(long a) {
        int counter = 0;
        while (a > 0) {
            if ((a & 1) == 1) ++counter;
            a = a >> 1;
        }
        return counter;
    }

}
