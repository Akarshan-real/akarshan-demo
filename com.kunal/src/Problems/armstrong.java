package Problems;

public class armstrong {
    public static void main(String[] args) {
        System.out.println(armStrongNumber(153));
    }
    static boolean armStrongNumber(long n){
        long last = 0 ;
        for (long i = n ; i>0 ; i=i/10){
            last = last + (i % 10) * (i % 10) * (i % 10) ;
        }
        return last == n;
//  }



//      while (n>0) {
//          last = last + (n % 10) * (n % 10) * (n % 10) ;
//          n = n/10 ;
//      }
    }
}
