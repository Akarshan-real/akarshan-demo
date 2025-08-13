package com.kunal;

public class Floor {
    public static void main(String[] args) {
        System.out.println(Floor(new int[]{2,3,5,9,14,16,18},15));
    }
    static int Floor(int[] array , int target) {
        if (target < array[0]) {
            return -1 ;
        }
        int start = 0 ;
        int end = array.length-1 ;
        boolean check ;
        int mid ;
        while(start <= end) {
            mid = start + (end - start)/2 ;
            check = array[mid] < target ;
            if (array[mid] == target) {
                return mid ;
            }
            else if (array[0] < array[array.length-1]) {
                if (check) { // array[mid] < target
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if (check) {
                    end = mid - 1 ;
                }
                else {
                    start = mid + 1 ;
                }
            }
        }
        return array[end] ;
    }
}