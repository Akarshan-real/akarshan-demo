package Leetcode;

public class L_1512 {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
    static int numIdenticalPairs(int[] nums) {
        int count = 0 ;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (!(i==j) && nums[j]==nums[i] && j > i ) {
                    count++;
                }
            }
        }
        return count;
    }
}
