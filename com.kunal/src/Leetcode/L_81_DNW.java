package Leetcode;

public class L_81_DNW {
    public boolean search(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target){
            return true ;
        }
        if (nums.length == 1 && nums[0] != target){
            return false ;
        }
        int pivot = findPivot(nums) ;
        if (pivot == -1){
            return BinarySearch(nums,target,0,nums.length-1) ;
        }
        if (nums[pivot] == target){
            return true ;
        }
        if (nums[0] <= target && target <= nums[pivot]){
            return BinarySearch(nums,target,0,pivot);
        }
        else {
            return BinarySearch(nums,target,pivot+1,nums.length-1);
        }
    }
    boolean BinarySearch(int [] arr , int target , int start , int end){
        while(start <= end){
            int mid = start + (end-start)/2 ;
            if (arr[mid] == target){
                return true;
            }
            if (arr[mid] < target){
                start = mid + 1 ;
            }
            else {
                end = mid - 1 ;
            }
        }
        return false ;
    }
    int findPivot(int [] arr){
        int start = 0 ;
        int end = arr.length - 1 ;
        while (start <= end){
            int mid = start + (end-start)/2 ;
            if (arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
                continue;
            }
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid ;
            }
            if (mid > start && arr[mid-1] > arr[mid]){
                return mid-1 ;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1 ;
            }
            else {
                start = mid + 1 ;
            }
        }
        return -1;
    }
}
