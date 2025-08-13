package Leetcode;
// DID NOT WORK
public class l_198 {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,1,1}));
    }
    static int rob(int[] nums) {
        if (nums.length == 1){
            return nums[0] ;
        }
        if (nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int max = Integer.MIN_VALUE ;
        for (int i = 0 ; i < nums.length/2 ; i++) {
            max = Math.max(max,element(nums,i)) ;
            max =  Math.max(max,element(nums,i+1)) ;
        }
        if (max == Integer.MIN_VALUE){
            return 0 ;
        }
        else {
            return max ;
        }
    }
    static int element(int [] nums , int start){
        int sum = 0 ;
        for(int i = start ; i < nums.length ; i += 2) {
            sum = sum + nums[i] ;
        }
        return sum ;
    }
}
