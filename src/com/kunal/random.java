package com.kunal;


import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class random {

    public static void main(String[] args) {
        System.out.println(BinarySearch(new int[]{1,4,6,12,534,13134},-444));
    }
    static int BinarySearch (int [] array , int target) {
        if (array == null || array.length == 0 ){
            return -1 ;
        }

        int start = 0 ;
        int end = array.length-1 ;
        boolean check ;
        boolean nextCheck ;
        boolean umm = true ;
        if (array[0] == array[array.length-1] && array[0]==target) {
            return 0;
        }
        else {
            check = array[0]<array[array.length-1] ;
            while (umm) {
                int mid = start + ((end - start ) / 2);
                nextCheck = target < array[mid] ;
                if (start >= end){
                    umm = false ;
                    return array[mid+1];
                }
                if (array[mid] == target) {
                    umm = false ;
                    return mid;

                }
                else if(check) {
                    if (nextCheck) {
                        end = mid - 1;
                    }
                    else  {
                        start = mid + 1;
                    }
                }
                else {
                    if (nextCheck) {
                        start = mid + 1 ;
                    }
                    else {
                        end = mid - 1 ;
                    }
                }
            }
            return -1;
        }
    }
}
