package Problems;

public class Prime {
    public static void main(String[] args) {
        prime(13);
    }
    static void prime(int n){
        int check = 2;
        while (true) {
            if (n<=2 || check==n) {
                System.out.println("Prime");
                break;
            }
            else if (n%check==0){
                System.out.println("Not Prime");
                break;
            }
            check++;
        }
    }
}
