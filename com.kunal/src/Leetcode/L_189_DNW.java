package Leetcode;

public class L_189_DNW {
    public static void main(String[] args) {
//        int [] array = new int[]{1,2,3,4,5,6,7};
//        rotate(array,3);
//        System.out.println(Arrays.toString(array));
        System.out.println(2%3);
    }
    static void rotate(int[] nums, int k) { // 1,2,3 ->(1) 3,1,2 |(2) 2,3,1 |(3) 1,2,3 |
//                                                     (2) 3,1,2 |(5) 2,3,1 |(6) 1,2,3

        k = k % nums.length ;

        int [] array = new int[nums.length] ;
        for (int rotation = 0 ; rotation < k ; rotation++){
            System.arraycopy(nums,0,array,0,nums.length) ;
            for (int i = 0 , j = 1 ; i < nums.length ; i++ , j++){
                if (!(j < nums.length)) {
                    j = 0 ;
                }
                nums[j] = array[i] ;
            }
        }
    }
}
