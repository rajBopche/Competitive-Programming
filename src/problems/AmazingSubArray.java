package problems;

public class AmazingSubArray {

    public int solve(String A) {

        int ipLen = A.length();
        if (ipLen == 0) return 0;

        int result = 0;

        //Check for each char of string
        for (int i = 0; i < ipLen; ++i) {
            char currentChar = A.charAt(i);
            if (isAmazing(currentChar)) {
                //The total no of substring would be equal to the length of substring
                result += A.substring(i).length();
            }
        }

        return result % 10003;
    }

    public boolean isAmazing(char c) {
        boolean isAmazing = false;
        char[] amazing = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (char temp : amazing) {
            if (c == temp) {
                isAmazing = true;
                break;
            }
        }

        return isAmazing;
    }

}
