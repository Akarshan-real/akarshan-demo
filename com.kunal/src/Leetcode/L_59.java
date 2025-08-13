package Leetcode;
// Does not work
import java.util.Arrays;

public class L_59 {
    public static void main(String[] args) {
        int [] [] array = generateMatrix(4);
        for (int [] a: array){
            System.out.println(Arrays.toString(a));
        }
    }
    static int[][] generateMatrix(int n) {
        if (n==1){
            return new int[][]{{1}};
        }
        int [] [] array = new int [n] [n] ;
        array [0] [0] = 1 ;
        int i = 0 ;
        int j = 0 ;
        int element = 2 ;
        for (int k = 1; k < n*n; k++) {
            switch (direction(n, i, j , array)) {
                case 'w' -> { // up
                    i--;
                    array[i][j] = element++;
                }
                case 'a' -> { // left
                    j--;
                    array[i][j] = element++;
                }
                case 's' -> { // down
                    i++;
                    array[i][j] = element++;
                }
                case 'd' -> { // right
                    j++;
                    array[i][j] = element++;
                }
            }
        }
        return array ;
    }

    static char direction(int n ,int currentR , int currentC, int [] [] array) {
//        if ((currentR == 0 && currentR+1 < n && currentC == n-1 && array[currentR+1][currentC] == 0) || (currentC-1 >=0 && currentR-1 >=0 && array[currentR][currentC-1] != 0 && array[currentR][currentC+1] != 0 && array[currentR+1][currentC] == 0 && array[currentR+1][currentC] != 0)) {
//            return 's' ;// down
//        } else if ((currentC-1 > 0 && currentR == n-1 && array[currentR][currentC-1] == 0) || (currentC-1 >=0 && currentR-1 >=0 && array[currentR][currentC-1] == 0 && array[currentR][currentC+1] != 0 && array[currentR+1][currentC] != 0 && array[currentR-1][currentC] != 0)) {
//            return 'a';// left
//        } else if ((currentC == 0 && currentR-1 > 0 && array[currentR-1][currentC] == 0) || (currentC-1 >=0 && currentR-1 >=0 && array[currentR-1][currentC] == 0 && array[currentR][currentC-1] != 0 && array[currentR][currentC+1] != 0 && array[currentR+1][currentC] !=0) ) {
//            return 'w';// up
//        } else {
//            return 'd';// right
//        }
        if (currentC+1 < n && array[currentR][currentC+1] == 0){
            return 'd';
        }
        else if (currentR+1 < n && array[currentR+1][currentC] == 0) {
            return 's';
        }
        else if (currentC-1 >= 0 && array[currentR][currentC-1] == 0) {
            return 'a';
        }
        else {
            return 'w';
        }
    }
}
//up
// (currentR == n-1 && currentC == 0) || (currentR-1 >=0 && array[currentR-1][currentC] == 0 && currentC == 0) || (array[currentR-1][currentC] == 0 && array[currentR][currentC-1] != 0 && array[currentR][currentC+1] != 0 && array[currentR+1][currentC] !=0)
//down
// (currentR == 0 && currentC == n-1) || (currentC == n-1 && currentR+1 < n && array[currentR+1][currentC] == 0) || (array[currentR][currentC-1] != 0 && array[currentR][currentC+1] != 0 && array[currentR+1][currentC] == 0 && array[currentR+1][currentC] != 0)
//left
//(array[currentR][currentC-1] == 0 && array[currentR][currentC+1] != 0 && array[currentR+1][currentC] != 0 && array[currentR-1][currentC] != 0)
// must -> currentR < n && currentR >= 0 && currentC >= 0 && currentC < n &&