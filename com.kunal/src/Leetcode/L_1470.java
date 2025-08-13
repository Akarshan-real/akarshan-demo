package Leetcode;

import java.util.Arrays;

public class L_1470 { // [2,5,1,3,4,7] -> [2,3,5,4,1,7]
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{1,2,3,4,4,3,2,1},4)));
    }
    static int[] shuffle(int[] nums, int n) {
        int [] arr = new int[nums.length];
        for (int i = 0 , j = 0; j < n; i = i + 2 , j++) {
            arr[i] = nums[j] ;
            arr[i+1] = nums[n+j] ;
        }
        return arr;
    }
}
