import java.math.BigInteger;
import java.util.Scanner;

public class Evenodds {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger S = new BigInteger(s.next());
        BigInteger n = S.add(BigInteger.valueOf(1));
        n.equals( n.add(BigInteger.valueOf(1)) );
        BigInteger k = new BigInteger( s.next() );

        if(        k.compareTo(n.divide(BigInteger.valueOf(2))) <= 0)
            System.out.println(k.multiply(BigInteger.valueOf(2)).subtract(BigInteger.valueOf(1)));
        else
            System.out.println(k.subtract(n.divide(BigInteger.valueOf(2))).multiply(BigInteger.valueOf(2)));
    }
}
