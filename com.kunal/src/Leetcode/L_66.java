package Leetcode;

public class L_66 {
    public int [] plusOne(int [] digits){
        if (digits[digits.length-1] != 9){
            digits[digits.length-1] += 1 ;
            return digits ;
        }
        else {
            if (makeSure(digits)){
                int [] args = new int[digits.length+1];
                args[0] = 1 ;
                return args ;
            }
            else {
                for (int i = digits.length-1 ; i >= 0 ; i--){
                    if (digits[i] == 9){
                        digits[i] = 0 ;
                    }
                    else {
                        digits[i] += 1 ;
                        return digits;
                    }
                }
                return digits ;
            }
        }
    }
    boolean makeSure(int [] args){
        boolean check = true ;
        for (int i : args){
            if (i!=9){
                check = false ;
                return check ;
            }
        }
        return check ;
    }
}
