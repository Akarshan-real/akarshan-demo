package Leetcode;

import java.util.Arrays;

public class L_1929 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1,1,1,1,1})));
    }

    static int[] runningSum(int[] nums) {
        for(int i = 0 , sum = 0 ; i < nums.length ; i++) {
            sum = sum + nums[i] ;
            nums[i] = sum ;
        }
        return nums;
    }
}