package com.kunal;

import java.util.Arrays;

public class linear_search_array {
    public static void main(String[] args) {
        int [] nums = {21,34,64,234,123,53};
//        System.out.println(minValue(nums));
//        System.out.println(maxValue(nums));
//        System.out.println(linearSearch(nums,53));
//        System.out.println(linearSearchElement(nums,34));
//        System.out.println(linearSearchExist(nums,64));
//----------------------------------------------------------------------------------------------------------------------------------
        int [] [] arr = {   {1,2,654,3},
                            {4,651,5,6},
                            {7,8,456,64,9},
                            {3,234,12,32,64,456} } ;
        System.out.println(Arrays.toString(search(arr,351)));
        System.out.println(max(arr));
        System.out.println(min(arr));

    }
    // Search in the array and return index if item found and return -1 if not found

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
    static int linearSearchElement(int[] arr, int target) {
        for (int i : arr) {
            if (i == target) {
                return target;
            }
        }
        return Integer.MIN_VALUE;
    }
    static boolean linearSearchExist(int[] arr, int target) {
        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }
    static int minValue (int [] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr){
            if (i<min) {
                min = i ;
            }
        }
        return min ;
    }
    static int maxValue (int [] arr) {
        int min = Integer.MIN_VALUE;
        for (int i : arr){
            if (i>min) {
                min = i ;
            }
        }
        return min ;
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
    //2d arrays
    static int[] search(int [] [] arr,int target){
        if (arr.length == 0 ) {
            return new int[]{-1};
        }
        for (int indexRow = 0; indexRow < arr.length; indexRow++) {
            for (int indexCol = 0; indexCol < arr[indexRow].length; indexCol++) {
                if (arr[indexRow][indexCol] == target) {
                    return new int[]{indexRow,indexCol};
                }
            }
        }
        return new int[]{-1};
    }
    static int max(int [] [] arr){
        int max = arr[0][0] ;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max<arr[row][col]){
                    max = arr[row][col] ;
                }
            }
        }
        return max;
    }
    static int min(int [] [] arr){
        int min = arr[0][0] ;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (min>arr[row][col]){
                    min = arr[row][col] ;
                }
            }
        }
        return min;
    }
}

