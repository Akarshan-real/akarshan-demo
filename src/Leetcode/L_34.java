package Leetcode;

import java.util.Arrays;

public class L_34 { // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1,2,3,4,4,4,6,7,8,9,10,10,10,12,12},11)));
    }

    static int[] searchRange(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length - 1 ;
        int mid ;
        int [] array = new int[]{-1,-1} ;

        while (start <= end) {
            mid = start + (end-start) / 2 ;
            if (target <= nums[mid]) {
                end = mid - 1 ;
            }
            else {
                start = mid + 1 ;
            }
        }
        if (start >= 0 && start < nums.length && nums[start] == target) {
            array[0] = start;
        }
        start = 0 ;
        end = nums.length - 1 ;
        while (start <= end) {
            mid = start + (end-start) / 2 ;
            if (target >= nums[mid]) {
                start = mid + 1 ;
            }
            else {
                end = mid - 1 ;
            }
        }
        if (end >= 0 && end<nums.length && nums[end]==target) {
            array[1] = end;
        }
        return array;
    }
}