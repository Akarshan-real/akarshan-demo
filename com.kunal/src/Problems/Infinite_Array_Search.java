package Problems;

public class Infinite_Array_Search {

    public static void main(String[] args) {
        System.out.println(ans(new int[]{1,2,3,4,5,6,7,7,7,7,7,8,9,9},5));
    }
    static int ans(int[] array , int target){
        int start = 0 ;
        int end = 1 ;
        while (array[end] < target) {
            int temp = end + 1 ;
            end = end + (end - start + 1)*2 ;
            start = temp ;
        }
        return BinarySearch(array,target,start,end);
    }

    static int BinarySearch (int [] array , int target,int start , int end) {
        if (array == null || array.length == 0){
            return -1 ;
        }
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
