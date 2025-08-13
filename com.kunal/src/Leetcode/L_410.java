package Leetcode;

public class L_410 {
    public static void main(String[] args) {

    }
    static int splitArray(int[] nums, int m) {
        int start = 0 ;
        int end = 0 ;
        for (int num : nums) {
            start = Math.max(start, num);// in the end of the loop it will contain the max element in the array
            end = end + num;
        }
        while (start <= end) {
            // try for the middle potential answer
             int mid = start + (end-start)/ 2 ;

             // calculate how many pieces you can divide this in with this max sum
            int sum = 0 ;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid){
                    // you cannot add this in the subarray , make a new one
                    // say you add this num in the subarray , then sum = num
                    sum = num ;
                    pieces++;
                }
                else {
                    sum += num ;
                }
            }
            if (pieces > m){
                start = mid + 1 ;
            }
            else {
                end = mid ;
            }

        }
        return start ; // here start == end
    }
}
