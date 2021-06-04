package problems;

public class RemoveConsecutiveChars {

    public String removeConsecutiveChars(String inpStr, int len) {
        int ipLen = inpStr.length();
        if (ipLen == 0) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ipLen; ++i) {
            int j = i;

            while (((j + 1) < ipLen) && inpStr.charAt(j) == inpStr.charAt(j + 1)) {
                ++j;
            }

            if ((j - i) != (len - 1)) {
                String subStr = inpStr.substring(i, j + 1);
                result.append(subStr);
            }
            i = j;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        RemoveConsecutiveChars rm = new RemoveConsecutiveChars();
        System.out.println(rm.removeConsecutiveChars("abb", 1));
    }
}
