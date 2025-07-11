package Leetcode;

public class L_1295 { // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=problem-list-v2&envId=array
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{1,12,123,1234,12345,123456}));
    }
    static int findNumbers(int [] nums){
        int total = 0 ;
        for (int check : nums) {
            int count = 0 ;
            while(check>0){
                count++;
                check = check/10;
            }
            if (count%2==0){
                total++;
            }
        }
        return total;
    }
}
