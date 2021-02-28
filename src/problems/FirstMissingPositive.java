package problems;

import java.util.ArrayList;

public class FirstMissingPositive {

    public int firstMissingPositive(ArrayList<Integer> A) {

        //first check if 1 is present or not, if not then return 1
        //This is because any element greater then size or less than equal to zero
        //will be replaced by 1, because we don't care for them,
        //Why? because our missing element will be in range 1..N+1 only
        boolean isOnePresent = false;
        int size = A.size();

        for (Integer num : A) {
            if (num == 1) {
                isOnePresent = true;
                break;
            }
        }

        if (!isOnePresent) return 1;


        //The input element less than equal zero and greater then size
        //will not be of any help, because we are using index of array to keep track of
        //present and missing element in input. And index cannot be negative or greater than
        //the size of array. Hence we set them as 1.

        for (int i = 0; i < size; ++i) {
            int currentNum = A.get(i);
            if (currentNum <= 0 || currentNum > size) A.set(i, 1);
        }

        //At this moment our input array contains elements in range
        //1..N only. The strategy is we will use indexes to keep track of elements which
        //are present or absent, how?
        //If input element is 4 we will mark the element at index 4 as negative.
        //If any index is having negative element then it means that index value is present input
        //But for size=4 array, the element present can be 1,2,3,4 but index are from 0,1,2,3
        //Hence slight modification is for element = 4, we need to mark index 4-1 element negative.
        //If the input array contains 1,2,3,4 then the elements at index 0,1,2,3 will all be negative.
        //This tells us that 1,2,3,4 is present in array and hence 5 is missing so return A.size()+1

        //If the input array has 1,2,3,5 then elements at index 0,1,2 will be negative
        //but element at index 3
        for (int i = 0; i < size; ++i) {
            int currentNum = Math.abs(A.get(i));
            if (A.get(currentNum - 1) < 0) continue;
            A.set(currentNum - 1, -A.get(currentNum - 1));
        }

        //Check if any number is positive
        //If any number at some index is positive that means
        // there was no index+1 to point to that index to make it negative and hence it was missing
        for (int i = 0; i < size; ++i) {
            int currentNum = A.get(i);
            if (currentNum < 0) continue;
            return i + 1;
        }

        return A.size() + 1;
    }
}
