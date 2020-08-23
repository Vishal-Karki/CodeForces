import java.math.BigInteger;
import java.util.Scanner;

public class calculatingFunctions {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = new BigInteger(s.next());
        BigInteger sum ;

        if(n.remainder(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0)))
           sum = n.divide(BigInteger.valueOf(2));
        else
            sum = ((n.divide(BigInteger.valueOf(2))).add(BigInteger.valueOf(1))).multiply(BigInteger.valueOf(-1));

        System.out.println(sum);
    }
}
