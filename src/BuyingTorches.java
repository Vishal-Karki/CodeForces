import java.math.BigInteger;
import java.util.Scanner;

public class BuyingTorches {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int z=0;z<T;z++){
            int x = s.nextInt(); int y = s.nextInt(); int k = s.nextInt();
            BigInteger X = new BigInteger(String.valueOf(x));
            BigInteger Y = new BigInteger(String.valueOf(y));
            BigInteger K = new BigInteger(String.valueOf(k));

            BigInteger ans ;
            ans = K.add(K.multiply(Y));

            ans = ans.subtract(BigInteger.valueOf(1));

            if( ans.mod(X.subtract(BigInteger.valueOf(1))).equals(BigInteger.valueOf(0)) ){
                ans = ans.divide(X.subtract(BigInteger.valueOf(1)));
            }else{
                ans = ans.divide(X.subtract(BigInteger.valueOf(1)));
                ans= ans.add(BigInteger.valueOf(1));
            }


            ans = ans.add(K);
            System.out.println(ans);

        }
    }
}
