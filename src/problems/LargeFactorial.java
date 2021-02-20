package problems;

public class LargeFactorial {

    public String solve(int A) {


        int[] result = new int[500]; //the final output is stored in reverse order
        result[0] = 1;
        int resultSize = 1;

        StringBuilder output = new StringBuilder();

        for (int i = 2; i <= A; ++i) {
            resultSize = basicMultiply(i, resultSize, result);
        }

        for (int i = resultSize - 1; i >= 0; --i) {
            output.append(result[i]);
        }

        return output.toString();
    }

    public int basicMultiply(int number, int resultSize, int[] result) {

        int carry = 0;

        for (int i = 0; i < resultSize; ++i) {
            int product = result[i] * number + carry;
            result[i] = product % 10;
            carry /= 10;
        }

        while (carry != 0) {
            result[resultSize] = carry % 10;
            carry /= 10;
            ++resultSize;
        }

        return resultSize;
    }

}
