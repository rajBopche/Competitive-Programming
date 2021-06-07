package problems;

public class MinimumParanthesis {

    public int solve(String A) {

        int ipLen = A.length();
        if (ipLen == 1) return 1;

        StringBuilder sb = new StringBuilder();

        int i = 1;

        sb.append(A.charAt(0));

        while (i < ipLen) {
            int sbLastIndex = sb.length() - 1;

            if (sbLastIndex == -1) {
                sb.append(A.charAt(i));
                ++i;
                continue;
            }

            if (sb.charAt(sbLastIndex) == A.charAt(i)) {
                sb.append(A.charAt(i));
            }

            if (sb.charAt(sbLastIndex) == ')' && A.charAt(i) == '(') {
                sb.append(A.charAt(i));
            }

            if (sb.charAt(sbLastIndex) == '(' && A.charAt(i) == ')') {
                sb.deleteCharAt(sbLastIndex);
            }

            ++i;
        }

        return sb.length();
    }

    public static void main(String[] args) {
        System.out.println(new MinimumParanthesis().solve("()(()(()"));
    }
}
