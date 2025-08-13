package com.kunal;

import java.util.Arrays;

public class Binary2D {
    // MY METHOD OF DOUBLE BINARY SEARCH
    public static void main(String[] args) {
        int[][] arr = new int[][]
                {{10,11,12,13},
                 {20,23,24,26},
                 {30,34,36,37,39},
                 {40,41,45},
                 {50,52,54,57},
                 {60,67,68,69}};
        System.out.println(Arrays.toString(binarySearch2D(arr,11)));
    }
    static int [] binarySearch2D (int [] [] array, int target) {
        int start = 0 ;
        int end = array.length-1 ;
        int row;
        while (start <= end) {
            row = start + (end-start)/2 ; // (start+end)/2
            if (array[row][0] <= target && target <= array[row][array[row].length-1]) {
                return binarySearch(array , target ,0 , array[row].length-1 , row);
            }
            if (array[row][0] < target) {
                start = row + 1 ;
            }
            else {
                end = row - 1 ;
            }
        }
        return new int[]{-1,-1};
    }
    static int [] binarySearch (int [] [] array , int target , int start , int end , int row) {
        while (start <= end){
            int mid = start + (end-start)/2 ;
            if (array[row][mid] == target) {
                return new int[]{row,mid} ;
            }
            if (array[row][mid] < target ) {
                start = mid + 1 ;
            }
            else {
                end = mid - 1 ;
            }
        }
        return new int[]{-1,-1};
    }
}