package Leetcode;

import java.util.Arrays;
// DOES NOT WORK

public class L_34_2 { // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(searchRange(new int[]{1,2,3,4,4,4,6,7,8,9,10,10,10,12,12},10)));
        System.out.println(Arrays.toString(searchRange(new int[]{1,3},1)));
    }

    static int[] searchRange(int[] nums, int target) {
        int start = 0 ;
        int start_ = 0 ;
        int end = nums.length - 1 ;
        int end_ = nums.length - 1 ;
        int mid ;
        int mid_ ;
        int [] array = new int[]{-1,-1} ;

        while (start <= end) {
            mid = start + (end-start) / 2 ;
            mid_ = start_ + (end_-start_) / 2 ;
            if (target <= nums[mid]) {
                end = mid - 1 ;
            }
            else {
                start = mid + 1 ;
            }
            if (target >= nums[mid_]) {
                start_ = mid_ + 1 ;
            }
            else {
                end_ = mid_ - 1 ;
            }
        }
        if (start >= 0 && start < nums.length && nums[start] == target) {
            array[0] = start;
        }
        if (end_ >= 0 && end_ < nums.length && nums[end_]==target) {
            array[1] = end_;
        }

        return array;
    }
}