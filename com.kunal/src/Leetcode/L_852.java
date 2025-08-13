package Leetcode;

public class L_852 { // https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
    // https://leetcode.com/problems/find-peak-element/description/
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{1,2,3,4,5,6,7,8,22,33,44,55,7,6,5,4,3,2,1}));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0 ;
        int end = arr.length-1 ;
        int mid = start + (end - start)/2  ;
        while(start<end){
            if (arr[mid] < arr[mid+1] ){
                start = mid + 1 ;
            }
            else {
                end = mid ;
            }
            mid = start + (end - start)/2 ;
        }
        return arr[mid] ;
    }
}