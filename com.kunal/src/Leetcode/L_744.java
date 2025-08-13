package Leetcode;

public class L_744 { //https://leetcode.com/problems/find-smallest-letter-greater-than-target/?envType=problem-list-v2&envId=array
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'a','b','c','c','c','x','y'},'c'));
    }
    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0 ;
        int end = letters.length - 1 ;
        int mid ;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target >= letters[mid]) {
                start = mid + 1 ;
            }
            else {
                end = mid - 1 ;
            }
        }
        return letters[start % letters.length];
    }
}