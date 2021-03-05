package problems;

import java.math.BigInteger;

public class UniquePathsInGrid {
    public int uniquePaths(int A, int B) {


        if (A == 0 || A == 1) return 1;
        if (B == 0 || B == 1) return 1;

        BigInteger a = BigInteger.valueOf(A - 1);
        BigInteger b = BigInteger.valueOf(B - 1);

        BigInteger totalMoves = a.add(b);
        BigInteger factA = factorial(a);
        BigInteger factB = factorial(b);
        BigInteger factTotalMoves = factorial(totalMoves);
        BigInteger result = (factTotalMoves).divide(factA.multiply(factB));
        return result.intValue();
    }

    private BigInteger factorial(BigInteger A) {
        if (A.equals(BigInteger.ONE)) return BigInteger.ONE;
        BigInteger fact = A.multiply(factorial(A.subtract(BigInteger.ONE)));
        return fact;
    }
}
