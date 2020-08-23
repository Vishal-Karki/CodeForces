import java.util.Scanner;
public class DesignTutorialLearnFromMath{
    private static Scanner s = new Scanner(System.in);
    static int LIMIT = 1000001;

    static long i,j;
    static long[] prime = new long[LIMIT];
    private static void primeList(){
        prime[0]=prime[1]=1;
        for( i=2;i<LIMIT;i++){
            if(prime[(int) i] == 0){
                for( j=i*i;j<LIMIT;j+=i){
                    prime[(int) j] = 1;
                }
            }
        }
    }
    public static void main(String[] args){
        primeList();
     long n = s.nextInt(); long a,b;
     for(int i=4;i<=n;i++){
         a=i; b=n-i;
         if(prime[(int) a]==1 & prime[(int) b]==1){
             System.out.println(a+" "+b); break;
         }
     }
    }
}