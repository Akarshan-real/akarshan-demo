package Leetcode;

public class L_1672_2 { // https://leetcode.com/problems/richest-customer-wealth/description/?envType=problem-list-v2&envId=array
    public static void main(String[] args) {
        int [] [] arr = { {1,54,1},
                {3,1,5},
                {65,1,1},
                {76,98,1}
        };
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int [] [] accounts){
        int [] compare = new int[accounts.length];
        int i = 0 ;
        for (int[] account : accounts) {
            for (int b : account) {
                compare[i] = compare[i] + b;
            }
            i++;
        }
        i = compare[0] ;
        for (int k : compare) {
            if (i < k) {
                i = k;
            }
        }
        return i;
    }
}
