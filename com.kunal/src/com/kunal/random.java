package com.kunal ;

import java.util.Arrays;

class random {
    public static void main(String[] args) {
        int [] [] array = new int[][]{{-19,9},{-15,-19},{-5,-8}};
        System.out.println(findMaxValueOfEquation(array,10));
    }
    static int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE ;
        for (int i = 0 ; i < points.length ; i++) {
            for (int j = 0 ; j < points.length ; j++) {
                if (i >= j){
                    continue;
                }
                if (Math.abs(points[i][0] - points[j][0]) <= k){
                    max = Math.max(max,output(points[i],points[j])) ;
                }
            }
        }
        return max ;
    }
    static int output(int [] array_1 , int [] array_2){
        return array_1[1] + array_2[1] + Math.abs(array_1[0] - array_2[0]) ;
    }

}