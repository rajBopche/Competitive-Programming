package problems;

public class ReverseInteger {


    public int reverse(int A) {

        boolean isNeg = false;
        long revNum = 0;

        if (A < 0) {
            isNeg = true;
            A = -A;
        }

        while (A != 0) {
            int lastDig = A % 10;
            revNum = revNum * 10 + lastDig;
            A = A / 10;
        }

        if(revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE) return 0;

        if (isNeg) return (int)-revNum;
        else return (int)revNum;
    }

    public static void main(String[] args) {
        new ReverseInteger().reverse(1146467285);
    }

}
