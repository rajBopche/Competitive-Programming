package problems;

public class StringPalindrome {

    public int isPalindrome(String A) {

        int strLen = A.length();

        if(strLen == 0 || strLen == 1) return 1;

        //Maintain two pointers one from start and other from end
        int leftPointer=0;
        int rightPointer=strLen-1;

        //check until both pointer are equal or cross each other
        while(leftPointer<rightPointer){

            //To handle uppercase and lowercase issue
            char leftChar = Character.toLowerCase(A.charAt(leftPointer));
            char rightChar = Character.toLowerCase(A.charAt(rightPointer));

            //increment leftPointer if leftChar is not valid alphanumeric
            if(isAlphanumeric(leftChar)){
                ++leftPointer;
                continue;
            }

            //decrement rightPointer if rightChar is not valid alphanumeric
            if(isAlphanumeric(rightChar)){
                --rightPointer;
                continue;
            }

            //If both start and end char are same, continue comparing in next pass
            //else return 0, the string is not palindrome
            if(leftChar==rightChar){
                ++leftPointer;
                --rightPointer;
                continue;
            }else return 0;

        }
        return 1;
    }


    //Check if the character is a valid alphaNumeric character
    public boolean isAlphanumeric(char c) {
        return c < 0x30 || (c >= 0x3a && c <= 0x40) || (c > 0x5a && c <= 0x60) || c > 0x7a;
    }

}
