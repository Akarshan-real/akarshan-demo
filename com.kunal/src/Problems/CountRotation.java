package Problems;

public class CountRotation {
    public static void main(String[] args) {
        System.out.println(rotationCount(new int[]{100,1,2,3,4,5,6,7,8,9}));
        // counts how many times array is rotated
    }

    static int rotationCount(int[] arr) {
        return findPivot(arr)+1 ;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (start < mid && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else { // arr[start] <= arr[mid]
                start = mid + 1;
            }
        }
        return -1;
    }
}