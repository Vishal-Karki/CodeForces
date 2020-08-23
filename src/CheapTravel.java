import java.util.Scanner;

public class CheapTravel {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int m = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();

        if( m * a <= b)
            System.out.println( n * a );
        else System.out.println(  (  (n/m)*b + Math.min( (n%m)*a,b )   )  );
    }
}
