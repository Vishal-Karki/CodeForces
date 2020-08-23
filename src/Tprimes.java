import java.util.Scanner;

public class Tprimes {
    private static Scanner s = new Scanner(System.in);
    static long LIMIT =1000001;
    static long i,j;
     static long[] prime= new long[1000001];
     private static void primelist(){
        prime[0]=1; prime[1]=1;
        for( i = 2; i< LIMIT; i++){
            if(prime[(int) i]==0){
                for( j = i*i; j< LIMIT; j+=i){
                    prime[(int) j]=1;
                }
            }
        }
     }
     private static boolean perfectsquare(long n){
         double sq =  Math.sqrt(n);
         if( sq - Math.floor(sq) == 0)
             return true;
         return false;
     }

    public static void main(String[] args) {
        primelist();
        long n = s.nextLong();
        for (int m = 0; m < n; m++) {
            long x = s.nextLong();
            if(x==4){
                System.out.println("YES");
            }else if(x%2 == 0){
                System.out.println("NO");
            }else if ( perfectsquare(x) && prime[(int) Math.sqrt(x)] == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
