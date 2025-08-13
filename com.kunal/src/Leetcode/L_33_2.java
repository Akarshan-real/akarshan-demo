package Leetcode;



// DOES NOT WORK

















//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class L_33_2 {
    public static void main(String[] args) {
//        System.out.println(search(new int[]{22,33,44,0,1,2,3,4,5,6,7,8,9},4));
//        System.out.println(search(new int[]{4,5,6,7,0,1,2},0));
        System.out.println(search(new int[]{3,1},4));
    }
    static int findPivot(int [] arr){
        int start = 0 ;
        int end = arr.length - 1 ;
        int mid = start + (end-start) / 2 ;
        while (start <= end) {
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid ;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1 ;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1 ;
            }
            // arr[start] <= arr[mid]
            else {
                start = mid + 1 ;
            }
            mid = start + (end-start) / 2 ;
        }
        return -1 ;
    }
    static int BinarySearch (int [] array , int target ,int start , int end) {
        if (array == null || array.length == 0) {
            return -1;
        }
        boolean check;
        boolean nextCheck;
        if (array[0] == array[array.length - 1] && array[0] == target) {
            return 0;
        } else {
            check = array[start] <= array[end];
            while (start <= end) {
                int mid = start + ((end - start) / 2);
                nextCheck = target < array[mid];
                if (array[mid] == target) {
                    return mid;
                } else if (check) {
                    if (nextCheck) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (nextCheck) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
            return -1;
        }
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums) ;
        if (pivot == -1 ){
            return BinarySearch(nums,target,0,nums.length-1);
        }
        if (nums[pivot] == target){
            return pivot ;
        }
        if(target >= nums[0]){
            return BinarySearch(nums,target,0,pivot-1) ;
        }
        else {
            return BinarySearch(nums,target,pivot+1,nums.length-1) ;
        }
    }
}