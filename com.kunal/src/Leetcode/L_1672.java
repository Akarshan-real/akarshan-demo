package Leetcode;

public class L_1672 { // https://leetcode.com/problems/richest-customer-wealth/description/?envType=problem-list-v2&envId=array
    public static void main(String[] args) {
        int [] [] arr = { {1,54,1},
                          {3,1,5},
                          {65,1,1},
                          {76,98,1}
                        };
        System.out.println(maximumWealth(arr));
    }
    static String maximumWealth(int [] [] accounts){
        int [] compare = new int[accounts.length];
        int i = 0 ;
        for (int[] account : accounts) {
            for (int b : account) {
                compare[i] = compare[i] + b;
            }
            i++;
        }
        int max = compare[0] ;
        for (int j = 0 ; j<compare.length ; j++){
            if (max<compare[j]){
                max = compare[j] ;
                i = j ;
            }
        }
        i++;
        return i + " is the richest person here.";
    }
}
