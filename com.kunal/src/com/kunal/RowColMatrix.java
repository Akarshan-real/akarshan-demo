package com.kunal;

import java.util.Arrays;

public class RowColMatrix {
    // ONLY FOR SQUARE MATRIX or PROPER MATRIX
    public static void main(String[] args) {
        int[][] arr = new int[][]
                {       {10,11,12,13},
                        {20,23,24,26},
                        {30,34,36,39},
                        {40,41,45,49},
//                        {50,52,54,57},
//                        {60,67,68,69}
                };
        System.out.println(Arrays.toString(search(arr,45)));
        System.out.println(arr[0][arr.length-1]);
    }
    static int [] search(int [] [] matrix , int target){
        int row = 0 ;
        int column = matrix.length - 1 ;
        while (row < matrix.length && column >= 0 ) {
            if (matrix[row][column] == target) {
                return new int[]{row,column} ;
            }
            if (matrix[row][column] < target) {
                row++;
            }
            else {
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}