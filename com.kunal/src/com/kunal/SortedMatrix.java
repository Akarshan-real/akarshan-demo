package com.kunal;

import java.util.Arrays;

public class SortedMatrix {
    // ONLY FOR SQUARE MATRIX or PROPER MATRIX
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                {3, 7, 12},
                {54, 58, 61},
                {75, 79, 83},
                {93, 97, 101}
        };
        System.out.println(Arrays.toString(search(arr,61)));

    }

    static int[] simpleBinarySearch(int [] [] matrix , int row , int cStart , int cEnd , int target){
        int mid ;
        while (cStart <= cEnd){
            mid = cStart + (cEnd-cStart)/2 ;
            if (matrix[row][mid] == target){
                return new int[]{row,mid} ;
            }
            if (matrix[row][mid] < target){
                cStart = mid + 1 ;
            }
            else {
                cEnd = mid - 1 ;
            }
        }
        return new int[]{-1,-1} ;
    }

    static int [] search(int [] [] matrix,int target) {
        int rows = matrix.length ;
        int column = matrix[0].length ;

        if (rows==1){
            return simpleBinarySearch(matrix,0,0,column-1,target);
        }

        int rStart = 0 ;
        int rEnd = rows - 1 ;
        int cMid = column / 2 ;

        while (rStart < (rEnd-1)) {
            int mid = rStart + (rEnd-rStart)/ 2 ;
            if (matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid ;
            }
            else {
                rEnd = mid ;
            }
        }

        // Now we have 2 rows
        // check whether the target is inside the columns of 2 rows

        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart,cMid} ;
        }
        if (matrix[rStart+1][cMid] == target){
            return new int [] {rStart+1,cMid} ;
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid-1]){
            return simpleBinarySearch(matrix,rStart,0,cMid-1,target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][column-1]){
            return simpleBinarySearch(matrix,rStart,cMid+1,column-1,target);
        }
        // search in 3rd half
        if (target <= matrix[rStart+1][cMid-1]){
            return simpleBinarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        // search in 4th half
        else {
            return simpleBinarySearch(matrix,rStart+1,cMid+1,column-1,target);
        }
    }
}