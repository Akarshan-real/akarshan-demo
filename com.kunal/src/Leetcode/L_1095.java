package Leetcode;
// https://leetcode.com/problems/find-in-mountain-array/description/
public class L_1095 {
    public static void main(String[] args) {
        System.out.println(findInMountainArray(new int[]{1,3,4,5,4,2,1},1));
    }
    static int findInMountainArray(int [] mountainArr , int target ) {
        int count = 0 ;
        if (BinarySearch(mountainArr,target,peakIndexInMountainArray(mountainArr),mountainArr.length-1) != -1){
            count++;
        }
        if (BinarySearch(mountainArr,target,0,peakIndexInMountainArray(mountainArr)-1) != -1){
            count++;
        }
        return count ;
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0 ;
        int end = arr.length-1 ;
        int mid = start + (end - start)/2  ;
        while(start<end){
            if (arr[mid] < arr[mid+1] ){
                start = mid + 1 ;
            }
            else { // arr[mid] > arr[mid+1]
                end = mid ;
            }
            mid = start + (end - start)/2 ;
        }
        return mid ;
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
            check = array[0] < array[array.length - 1];
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
}
