package Leetcode;

import java.util.Arrays;

public class L_73 {
    public static void main(String[] args) {
        int [] [] array = new int[][]{{1,2,0,3},{6,0,9,8},{1,7,2,9}};
        setZeroes(array);
//        for (int [] i : array){
//            System.out.println(Arrays.toString(i));
//        }
        System.out.println(5-5/2);
    }
    static void setZeroes(int[][] matrix) {
        int count = 0 ;
        int matrix_row_length = matrix[0].length;
        int matrix_column_length = matrix.length;
        int [] [] index_0 = new int[matrix_row_length*matrix_column_length] [2] ;
        for (int i = 0 , i_index = 0; i < matrix_column_length; i++) {
            for (int j = 0 ; j < matrix_row_length; j++) {
                if (matrix[i][j] == 0){
                    index_0[i_index][0] = i ;
                    index_0[i_index][1] = j ;
                    count++ ; i_index++ ;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            horizontalLOOP(matrix,index_0[i],matrix_row_length);
            verticalLOOP(matrix,index_0[i],matrix_column_length);
        }
    }
    static void horizontalLOOP(int [] [] matrix , int [] index , int length){
        for (int i = index[1] ; i < length; i++) {
            matrix[index[0]][i] = 0 ;
        }
        for (int i = index[1]; i >= 0 ; i--) {
            matrix[index[0]][i] = 0 ;
        }
    } 
    static void verticalLOOP(int [] [] matrix , int [] index , int length){
        for (int i = index[0] ; i < length ; i++) {
            matrix [i] [index[1]] = 0 ;
        }
        for (int i = index[0]; i >= 0 ; i--) {
            matrix[i][index[1]] = 0;
        }
    }
}
