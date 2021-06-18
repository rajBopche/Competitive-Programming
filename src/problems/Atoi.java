package problems;


public class Atoi {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int atoi(final String A) {

        if (A.length() == 0) return 0;
        boolean firstNumberVisited = false;
        boolean negative = false;
        boolean positive = false;
        StringBuilder sb = new StringBuilder();
        for (char tempChar : A.toCharArray()) {

            if (negative && !firstNumberVisited && tempChar == ' ') return 0;
            if (positive && !firstNumberVisited && tempChar == ' ') return 0;

            if (!firstNumberVisited && tempChar == '-') {
                negative = true;
                continue;
            }

            if (!firstNumberVisited && tempChar == '+') {
                positive = true;
                continue;
            }

            if (firstNumberVisited && tempChar == ' ') break;

            if (tempChar >= 48 && tempChar <= 57) {
                firstNumberVisited = true;
                sb.append(tempChar);
            } else {
                break;
            }
        }

        if (sb.length() == 0) return 0;

        if (negative) sb.insert(0, '-');

        int number = 0;
        try {
            number = Integer.parseInt(sb.toString());
        } catch (NumberFormatException exception) {
            if (sb.charAt(0) == '-') return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }
        return number;
    }
}


