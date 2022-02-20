package problems;

import java.util.HashSet;

public class TwoSum {

    static boolean isPairSumPresent(int[] arr, int n) {
        HashSet<Integer> hSet = new HashSet<>();
        for (int num : arr) {
            int diff = n - num;
            if (hSet.contains(diff)) {
                return true;
            } else {
                hSet.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        if (isPairSumPresent(arr, 16)) {
            System.out.println("The pair is present");
        } else {
            System.out.println("The pair is NOT present");
        }
    }

}
