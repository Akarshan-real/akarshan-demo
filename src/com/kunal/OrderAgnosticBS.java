package com.kunal;


public class OrderAgnosticBS {

    public static void main(String[] args) {
        System.out.println(BinarySearch(new int[]{1,2,3,4,5,6},4)+" index");
    }

    static int BinarySearch (int [] array , int target) {
        if (array == null || array.length == 0){
            return -1 ;
        }

        int start = 0 ;
        int end = array.length-1 ;
        boolean check ;
        boolean nextCheck ;
        if (array[0] == array[array.length-1] && array[0]==target) {
            return 0;
        }
        else {
            check = array[0]<array[array.length-1] ;
            while (start <= end) {
                int mid = start + ((end - start ) / 2);
                nextCheck = target < array[mid] ;
                if (array[mid] == target) {
                    return mid;
                }
                else if(check) {
                    if (nextCheck) {
                        end = mid - 1;
                    }
                    else  {
                        start = mid + 1;
                    }
                }
                else {
                    if (nextCheck) {
                        start = mid + 1 ;
                    }
                    else {
                        end = mid - 1 ;
                    }
                }
            }
            return -1;
        }
    }
}