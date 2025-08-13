package Leetcode;

public class L_1351 {
    public static void main(String[] args) {

    }
    //    [4, 3, 2, -1]
//    [3, 2, 1, -1]
//    [1, 1,-1, -2]
//   [-1,-1,-2, -3]
    public int countNegatives(int[][] grid) {
        int count = 0 ;
        for (int [] i : grid) {
            if(i[0] < 0){
                count += grid[0].length ;
                continue;
            }
            if (i[0] > 0 && i[grid[0].length-1] < 0){
                count += grid[0].length - BinarySearch(i,0,grid[0].length-1); // [1,1,-1,-3,-5,-9]
            }
        }
        return count ;
    }
    int BinarySearch(int [] arr , int start , int end){
        while(start < end){
            int mid = start + (end-start)/2 ;
            if (arr[mid] < 0){
                end = mid ;
            }
            else {
                start = mid + 1 ;
            }
        }
        return start ;
    }
}

