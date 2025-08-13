package com.kunal;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = new int[]{5,4,3,2,1};
        BubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void BubbleSort(int [] array){
        // run the steps n-1 times 
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false ;
            // for each step max item will come at last respective index
            for (int j = 1; j < array.length - i ; j++) {
                // swap if the item is smaller than the previous item
                if(array[j-1] > array[j]){
                    // swap
                    swapped = true ;
                    int temp = array[j] ;
                    array[j] = array[j-1] ;
                    array[j-1] = temp ;
                }
            }
            //  if 1 swap happened then array is not sorted then it will continue to run
            //  and
            //  if the value is false that means that the array is sorted and it will not run
            if(!(swapped)){
                break;
            }
        }
    }
}