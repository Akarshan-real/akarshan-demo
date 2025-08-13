package com.kunal;

public class PivotWithDuplicate {
    public static void main(String[] args) {
        System.out.println(findPivotWithDuplicate(new int[]{2,2,2,3,3,3,3,4,4,4,4,7,0,0,1,1,1,1,1}));
    }

    static int findPivotWithDuplicate(int [] arr) {
        int start = 0 ;
        int end = arr.length-1 ;
        int mid;
        while (start <= end) {
            mid = start + (end-start) / 2 ;
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid ;
            }
            if(start < mid && arr[mid-1] > arr[mid]) {
                return mid-1 ;
            }
            if (arr[start]==arr[mid] && arr[mid]==arr[end]) {
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start++;
                if (arr[end-1] > arr[end]) {
                    return end-1 ;
                }
                end--;
            }
            // left is sorted so pivot is in the right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1 ;
            }
            else {
                end = mid - 1 ;
            }
        }
        return -1 ;
    }
}
