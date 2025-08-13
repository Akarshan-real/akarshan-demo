package Leetcode;

public class L_1854 {
    static int maximumPopulation(int[][] logs) {
        int max = 0 ;
        int year = - 1 ;
        for (int i = logs[0][0]; i <= logs[logs.length-1][logs[logs.length-1].length-1] ; i++) {
             int alive = 0 ;
             for (int [] log : logs) {
                 if  (i >= log[0] && i < log[1]) {
                     alive++;
                 }
             }
            if (alive > max){
                max = alive ;
                year = i ;
            }
        }
        return year ;
    }
}
