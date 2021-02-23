package problems;

import java.util.ArrayList;

public class AddOne {

    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        int lastDigitSum = A.get(A.size() - 1) + 1;
        if (lastDigitSum > 9) {
            addFromLastDigit(A, lastDigitSum);
        } else {
            A.set(A.size() - 1, lastDigitSum);
        }

        while (A.get(0) == 0) {
            A.remove(0);
        }

        return A;
    }

    public void addFromLastDigit(ArrayList<Integer> A, int lastDigitSum) {

        int lastDigit = lastDigitSum % 10;
        A.set(A.size() - 1, lastDigit);
        int carry = lastDigitSum / 10;

        for (int i = A.size() - 2; i >= 0; --i) {
            lastDigitSum = A.get(i) + carry;
            if (lastDigitSum > 9) {
                lastDigit = lastDigitSum % 10;
                carry = lastDigitSum / 10;
                A.set(i, lastDigit);
            } else {
                A.set(i, lastDigitSum);
                return;
            }
        }

        if (carry > 0) {
            A.add(0, carry);
        }
    }
}
