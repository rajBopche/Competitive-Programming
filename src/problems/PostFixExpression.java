package problems;

import java.util.ArrayList;

public class PostFixExpression {

    public static int evalRPN(ArrayList<String> A) {
        for (int i = 0; i < A.size(); ++i) {
            String curr = A.get(i);
            int res = Integer.MIN_VALUE;
            int a;
            int b;
            switch (curr) {
                case "+" -> {
                    a = Integer.parseInt(A.get(i - 1));
                    b = Integer.parseInt(A.get(i - 2));
                    res = b + a;
                }
                case "*" -> {
                    a = Integer.parseInt(A.get(i - 1));
                    b = Integer.parseInt(A.get(i - 2));
                    res = b * a;
                }
                case "-" -> {
                    a = Integer.parseInt(A.get(i - 1));
                    b = Integer.parseInt(A.get(i - 2));
                    res = b - a;
                }
                case "/" -> {
                    a = Integer.parseInt(A.get(i - 1));
                    b = Integer.parseInt(A.get(i - 2));
                    res = b / a;
                }
            }

            if (res != Integer.MIN_VALUE) {
                A.remove(i);
                A.remove(i - 1);
                A.remove(i - 2);
                A.add(i - 2, Integer.toString(res));
                i = -1;
            }
        }
        return Integer.parseInt(A.get(0));
    }
}
