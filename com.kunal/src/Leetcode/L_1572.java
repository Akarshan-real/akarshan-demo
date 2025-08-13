package Leetcode;

public class L_1572 {
    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{7,3,1,9},
                                                   {3,4,6,9},
                                                   {6,9,6,6},
                                                   {9,5,8,5}}));
    }
    static int diagonalSum(int[][] mat) {
        int length = mat.length ;
        int sum = 0 ;
        for (int i = 0 , j = length-1 ; i < length ; i++ , j--){
            sum = mat[i][i] + sum ;
            if(i==j){
                continue;
            }
            sum = mat[i][j] + sum ;
        }
        return sum ;
    }
    static void swap(int [] [] args , int first , int second) {
        int temp = first ;
        first = second ;
        second = temp ;
    }
}
