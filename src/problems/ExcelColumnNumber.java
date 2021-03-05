package problems;

public class ExcelColumnNumber {

    public int titleToNumber(String A) {

        int sum = 0;
        int size = A.length();

        for(int i=0; i<size; ++i){

            sum *= 26;
            sum += (A.charAt(i)-'A'+1);

        }
        return sum;

    }

}
