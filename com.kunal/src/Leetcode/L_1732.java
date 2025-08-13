package Leetcode;

import java.util.Arrays;

public class L_1732 {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }
    static int largestAltitude(int[] gain) { // [-5,1,5,0,-7]
        int [] last = new int[gain.length+1];
        last[0] = 0 ;
        for (int i = 0; i < gain.length; i++) {
            last[i+1] = gain[i] + last[i] ;
        }
        int max = Integer.MIN_VALUE ;
        for (int i : last) {
            if (max < i) {
                max = i ;
            }
        }
        return max;
    }
}
