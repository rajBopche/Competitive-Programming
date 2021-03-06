package problems;

public class TrailingZerosInFactorial {

    public int trailingZeroes(int A) {

        int ans = 0;
        while(A>=5){

            ans += A/5;
            A = A/5;

        }
        return ans;
    }
}
