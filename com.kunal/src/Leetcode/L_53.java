package Leetcode;

public class L_53 {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{4,2,0,0,1,1,4,4,4,0,4,0}));
    }
    static boolean canJump(int[] nums) {
        int my_index = 0 ;
        if (nums.length == 1){
            return true ;
        }
        if (nums[0] == 0){
            return false ;
        }
        while (true) {
            int number = nums[my_index] ;
            int next = max_check(nums,my_index,number+my_index) ;
            if (next == nums.length-1){
                return true ;
            }
            if (nums[next] == 0){
                return false ;
            }
            my_index = next;
        }
    }
    static int max_check(int [] nums , int start , int end){ // [4,2,0,0,1,1,4,4,4,0,4,0]
        if (end >= nums.length-1 || start == nums.length){
            return nums.length-1 ;
        }
        int index = start ;
        int max = Integer.MIN_VALUE ;
        int count_of_0 = 0 ;
        for (int i = start+1; i <= end ; i++){
            if(nums[i] == 0){
                count_of_0++;
            }
            if (nums[i] >= max) {
                max = nums[i] ;
                index = i ;
            }
        }
        if (count_of_0 >= max){
            return end ;
        }
        return index ;
    }
}
