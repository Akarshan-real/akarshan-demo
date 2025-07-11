package com.kunal;

import java.util.Arrays;

public class linear_search_string {
    public static void main(String[] args) {
        String name = "Akarshan";
        System.out.println(Arrays.toString(name.toCharArray()));
        char target = 's';
        System.out.println(search(name,target));
    }
    static boolean search(String s,char target){
        if (s.isEmpty()){
            return false;
        }
//        for (int i = 0; i < s.length(); i++) {
//            if (target == s.charAt(i)) {
//                return true ;
//            }
//        }
        //or
        for (char c : s.toCharArray()){
            if (c==target) {
                return true;
            }
        }
        return false;
    }
}
