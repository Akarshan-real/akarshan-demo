package Leetcode;

import java.util.Arrays;

public class L_1365 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] args = new int[nums.length] ;
        for (int i = 0 ; i < nums.length ; i++) {
            int count = 0 ;
            for (int j : nums) {
                if (nums[i] > j) {
                    count++;
                }
            }
            args[i] = count ;
        }
        return args ;
    }
}
