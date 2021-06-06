package problems;

public class ConvertPalindrome {

    public int solve(String A) {
        int ipLen = A.length();
        if (ipLen == 0 || ipLen == 1) return 1;

        int fInd = 0;
        int bInd = ipLen - 1;

        while (fInd <= bInd) {
            if (A.charAt(fInd) != A.charAt(bInd)) {
                String left = A.substring(0, fInd) + A.substring(fInd + 1, ipLen);
                String right = A.substring(0, bInd) + A.substring(bInd + 1, ipLen);
                boolean result = isPalindrome(left) || isPalindrome(right);
                if (result) return 1;
                else return 0;
            }
            ++fInd;
            --bInd;
        }
        return 1;
    }

    private boolean isPalindrome(String str) {
        int fInd = 0;
        int bInd = str.length() - 1;
        while (fInd < bInd) {
            if (str.charAt(fInd++) != str.charAt(bInd--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ConvertPalindrome().solve("baabav"));
    }

}
