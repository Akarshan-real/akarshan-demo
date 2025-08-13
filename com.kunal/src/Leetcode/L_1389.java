package Leetcode;
// WILL DO LATER
import java.util.Arrays;

public class L_1389 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createTargetArray(new int[]{0,1,0},new int[]{0,1,0})));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int [] target = new int[index.length];
        int count = 0 ;
        for (int i = 0 ; i < index.length ; i++) {
            if (index[i] < count){
                swap(target,index[i]);
            }
            target[index[i]] = nums[i];
            count++;
        }
        return target;
    }
    static void swap(int [] target , int position) {
        for (int i = target.length - 1; i > position; i--) {
            target[i] = target[i - 1];
        }
    }
}